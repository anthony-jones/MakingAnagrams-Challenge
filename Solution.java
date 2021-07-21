// ARRAYLIST METHOD

class Result {
    public static int makeAnagram(String a, String b) {
    
        // Convert string A to list
        ArrayList<Character> listA = new ArrayList<>(); 
        for(char c : a.toCharArray()){
            listA.add(c);
        }
        System.out.println("List A: " + listA);
        
        // Convert string B to list
        ArrayList<Character> listB = new ArrayList<>(); 
        for(char c : b.toCharArray()){
            listB.add(c);
        }
        System.out.println("List B: " + listB);
        
        // Remove every common character from lists, leaving only differences
        int index = 0;
        while(index < listA.size()){
            if(listB.contains(listA.get(index))){
                listB.remove(listA.get(index));
                listA.remove(listA.get(index));
            } else {
                index++;
            }
        }
        return listA.size() + listB.size();
    }
}

//
// INPUT: 
//      String a = "bacdc";
//	    String b = "dcbad";
//
// OUTPUT:
//      List A: [b, a, c, d, c]
//      List B: [d, c, b, a, d]
//      2
//
