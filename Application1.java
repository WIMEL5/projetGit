class Application1 
{ 
   static void main(String[ ] args) 
   { /* inverse d'une suite de caract�re dans un tableau par 
       permutation des deux extr�mes */ 
    char [ ] Tablecar ={'a','b','c','d','e','f'} ; 
    int i, j ; 
    System.out.println("tableau avant : " + String.valueOf(Tablecar)); 
    for ( i = 0 , j = 5 ;  i<j ; i++ , j-- ) 
     { char car ; 
       car = Tablecar[i]; 
       Tablecar[i ]= Tablecar[j]; 
       Tablecar[j] = car; 
     } 
    System.out.println("tableau apr�s : " + String.valueOf(Tablecar)); 
  } 
}