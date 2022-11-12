# LEZIONE 4-10

decomposizione: dividere un problema grosso in sotto-problemi più piccoli. Divido in MODULI (esempi oin go: le funzioni) che cooperano tra di loro con (ci si prova) lo stesso livello di dettaglio. I moduli sono indipendenti

<u>*ASTRAZIONE*</u>: tecnica dove si omettono dei dettagli per la comprensione del problema.

- <u>**parametrizzazione**</u>: usare i parametri pre scrivere cose più generali, no dati specifici
- <u>**procedurale**</u>: raccolgo una porzione di codice così da invocarlo qunado mi serve.
- <u>**specificazione**</u>: concetrare sul comportamento, non sul come, ma lo deve fare
- <u>**dati**</u>: contiene dati complessi con dei medodi propri
- <u>**iterazione**</u>: for, while ...
- <u>**gerarchia**</u> di tipi: int, float ....

<br>

# LEZIONE 7-10

> java: (oo) <-- object oriented: caratterizzato da due cose: **STATO** (informazioni) <--> **MEDODI** (comportamneti)

> CLASSE: codice che racchide le informazioni e i medoti dell'oggetto da usare. Chiamata anche interfaccia.

> Metodo: funzione. Ha un nome, ha un input di dati e potrebbe restituire un valore  
    - tiporestituito nomeMetodo(parametri formali){corpo medoto}   <-- comportamento  
->  + membri  <-- info

> PACCHETTI: collezione di classi. <-- serve per garantire l'onominia tra i file (risolve prob naming). es: Package (/)A.(/)C.(/)D file E.java

> ENCAPSULATION: visibilità

> COPRO FUNZIONE: sequenza (uno sotto l'altro), selezione (if, switch), iterazione (for, while).  
> **ISTRUZIONI**: espressioni: atomi (medodi, variabili, costanti), operatori(logici e matimatici)
>VARIABILI: locali, parametri formali -->  
> - tipo
        primitivi: int, long, float, double, char
        riferimento: oggetto
        dichiarazione: int x; int x = 0; string s = new String("ciao");
> - nome
> - valore
>
> Oggetti vivono in uno spazio chiamato **HEAP**. Gli oggetti posso essere mutabili o immutabili.
>
>Le stringhe sono oggetti complessi ed è immutabile.
>
>Garbage Collection automatico.  
**comparazione**:
    - tipi primitivi: == <-- stesso tipo
    - tipi di riferimento: v.equals(s) <-- per due stringhe s,v  
**invocazione** (medoto)
    esperssione.nomeMetodo(parametri, parametri)

<br>

# LEZIONE 14-10

JAVA  oo

classi: sono fatte di informazioni ////stato e da i suoi metodi
controllo dei tipi.

<br>

# LEZIONE 14-10

- BOXING/UNBOXING (liste)
- I/O --> scanner

<u>**LISTE**</u> (struttura dati dinamica)
collection
sintassi: List<string>
    - arrayList
    - linkedList

<br>

**FOR-EACH**:

```JAVA
for(String s : parole){}
```

<br>

le liste non possono essere di tipi primitivi --> uso il BOXING:
> int Integer

> double Double

> boolean Boolean

> valueOf

****SCANNER****

```JAVA
Scanner s = new Scanner(System.in);
```

>Args "linea di comando"

<br>

# LEZIONE 25-10

ECCEZZIONI:

astrazione --> procedurale:

- *parametrizzazione*: intestazione, parte sintattica che viene prima delle graffe e ci dice anche cosa returna
- *specificazione*: documentare 3 clausule => in->P->out <br>
servono a:
    - specificano: {R M E} (requires, modifies, effect)
    - implementano: {...}
    - use: come e perché

- DUE CATEGORIE
    - errori che non fanno compilare
    - errori che fanno compilare, ma fanno collassare il programma

<br>

# LEZIONE 04-11

"data type" --> dati con operazioni

*Data Astraction* (D.A.)= <object, comportamneto>
prima lo costruisco, lo possso osservare e modificare

le specificazioni non hanno dettagli implementativi

<u>**CLASS**</u> (interface) --> con **THIS** mi riferico all'istanza

- nome
- overview: cosa fa, dire anche se è mutabile o immutabile
- costruttori: creano un'istanza (oggetto)
- metdoti: abilità attarverso astrazione procedurale, che lavorano sugli oggetti
    - produttori
    - osservatori
    - modificatori

<u>**VARIABILI di INSTANZA**</u>: sono delle variabili che si trovano nella instanza e che posso essere di qualsiasi tipo, primitivo e non.

<br>

# LEZIONE 08-11

## **ADDITIONAL METHODS**

**costruttori**: sono i Static(fabbricatori)

- osservabili
- muatili
- produzione

<br>

object hanno tre metodi:
> toString: serve per esempio per rendere l'oggetto stampabile
>
> equals: se sono uguali dal punto di vista semantico. Fratello di un metodo chiamato .hashCode
>
> clone: copia l'oggetto. Non lo useremo ma useremo [oggetto].copia

<br>

<u> EQUALS & HASHCODE </u>  

> *EQUALS*
>
> - deve rappresentare una relazione d'equivalenza (rif, simm, <u>trans</u>).

> *HASH*
>
> - se a.equals(b) = true &ensp; => &ensp; a.hashCode() == b.hashCode()

<br>

## **AIDS for IMPLEMENTATION**
