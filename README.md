La portée d'une variable (Scope) est l'emplacement où une variable est disponible dans le code. Elle n'est disponible que dans le
bloc où vous la déclarez et jusqua la fin du bloc puis la varible seras détruite quelsque temps plus tard.
 
```java
class Test{
    int maVariableDansMaClass;
    public static void maFonction(){
        maVariableDansMaClass = 4;
        int maVariableDispoDansTouteMaMethode;
        maVariableDispoDansTouteMaMethode = 0;
        if(true){
            maVariableDispoDansTouteMaMethode = 1;
            int maVariableDispoDansToutMonBlocIf;
            for(int i = 0;i< 10;i++){
                int maVariableDispoDansToutMonBlocFor = 5;
                maVariableDansMaClass = 5;
                maVariableDispoDansTouteMaMethode = 1;
                maVariableDispoDansToutMonBlocIf = 3;
                if(maVariableDispoDansToutMonBlocIf + maVariableDispoDansTouteMaMethode + maVariableDansMaClass == 8){
                    maVariableDispoDansToutMonBlocFor = 10;
                    System.out.println("On vois que j'ai acces a toutes mes variables déclaré dans ma methode " +
                     "puisque touts mes blocs sont imbriqués");
                }
            }
        }
    }
}
```
Dans le cas d'une condition 
`if` par exemple si l'on crée une variable `x` alors celle ci ne sera accessible que dans le if. Si la variable est crée 
dans une `class` alors elle est accessible dans toutes les methodes de la classe.