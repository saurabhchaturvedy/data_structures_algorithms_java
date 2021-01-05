package main.java.Trie;

public class Trie {

    private TrieNode root;

    Trie()
    {
        root = new TrieNode();
    }

    private class TrieNode
    {
        private TrieNode[] children;
        private boolean isEndOfTheWord;

        TrieNode()
        {
            this.children = new TrieNode[26];
            this.isEndOfTheWord = false;
        }
    }


    private void insert(String word)
    {
        if(word==null || word.isEmpty())
            throw new IllegalArgumentException("Input is invalid");

        String s = word.toLowerCase();
        TrieNode current = root;
        for(int i=0; i<s.length(); i++)
        {
            char c = s.charAt(i);
            int index = c-'a';
            if(current.children[index]==null)
            {
                TrieNode newTrieNode = new TrieNode();
                current.children[index] = newTrieNode;
                current = newTrieNode;
            }
            else
            {
                current = current.children[index];
            }
        }
        current.isEndOfTheWord = true;
    }


    public static void main(String[] args) {
        Trie trie = new Trie();
        trie.insert("cat");
        trie.insert("cab");
        trie.insert("son");
        trie.insert("so");
        System.out.println("Words inserted successfully: ");
    }
}
