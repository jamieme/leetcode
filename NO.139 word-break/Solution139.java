import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

class Solution139{
    public static void main(String[] args){
        Solution139 s = new Solution139();
        System.out.println(s.wordBreak("aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaab",
                Arrays.asList("a","aa","aaa","aaaa","aaaaa","aaaaaa","aaaaaaa","aaaaaaaa","aaaaaaaaa","aaaaaaaaaa")));  
        
        System.out.println(s.wordBreak("leetcode",Arrays.asList("leet","code")));
    }

    public boolean wordBreak(String s, List<String> wordDict) {
        Set<String> dicts = new HashSet<>(wordDict.size());
        wordDict.forEach(i->dicts.add(i));
        Boolean[] mem=new Boolean[s.length()];

        return canBreak(s, 0, dicts,mem);
    }

    private boolean canBreak(String s, int beg, Set<String> dict,Boolean[] mem){
        if(beg>=s.length()) return true;
        if(mem[beg]!=null)  return mem[beg];

        for(int i=beg+1;i<s.length()+1;i++){
            String prefix = s.substring(beg,i);
            if(dict.contains(prefix)){
                if(canBreak(s, i, dict,mem)){
                    mem[beg] = true;
                    return true;
                }    
            }
        }

        mem[beg] = false;
        return false;
    }
}