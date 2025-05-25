package search.rabinkarp;

public class RabinKarp {
    // size of the alphabet
    private final int d = 26;
    // prime number for mudulo (%) operator
    private final int q = 31;

    public int search(String text, String pattern) {
        int patternLength = pattern.length();
        int textLength = text.length();

        // hashes for the region of the text and patterns
        int hashText = 0;
        int hashPattern = 0;

        // the largest polynomial term in the fingerprint function
        int h = 1;

        // largest polynomial
        for (int i = 0; i < patternLength - 1; i++) {
            h = (h * d) % q;
        }

        // pre-compute the hash of the pattern O(M)
        for (int i = 0; i < patternLength; i++) {
            hashPattern = (d * hashPattern + pattern.charAt(i)) % q;
            hashText = (d * hashText + text.charAt(i)) % q;
        }

        // slide the pattern over text one by one
        for (int i = 0; i <= textLength - patternLength; i++) {
            // check the hash values of current window of text
            // and pattern. If the hash values match then only
            // check for characters one by one
            if(hashPattern == hashText) {
                int j = 0;

                // if the hashes match then we have to check the letters one by one
                for (j = 0; j < patternLength; j++) {
                    if(text.charAt(i + j) != pattern.charAt(j)) {
                        break;
                    }
                }

                // all the characters are matching, it is a match
                if(j == patternLength) {
                    return i;
                }
            }

            // update the hash for the actual substring of the text
            if(i < textLength - patternLength) {
                hashText = ((hashText - text.charAt(i) * h) * d + text.charAt(i + patternLength)) % q;
                // we might get a negative value, so we have to make sure the hash is positive
                if(hashText < 0) {
                    hashText += q;
                }
            }
        }

        // text does not contain the pattern
        return -1;
    }
}
