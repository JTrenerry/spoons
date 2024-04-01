# Documentation

### The Basics
1. Every block of code needs to start with 'sp'.
2. Every block of code must end in 'n'.
3. Uses a ternary like system between the characters o = 0, O = 1 and 0 = 2.
4. Codes should be seperated by a '-'
5. Variables are loosely typed (i.e. like python)

---

### Values
The first 128 combinations of 'o', 'O' and '0' are reserved for ascii characters, i.e. numbers, letters etc. For a table of values see [here](./VALUES.md)

---

### Printing to standard out
To print to stdout the code '00000' (all zeros) should be used followed by whatever you want to print and finally '00000' again.

Example Usage:   
```sp00000-oOo-00000n``` would print the value for 'oOo' (<value>) to stdout.

---

### Strings
To make a string start with a marker (' " ', " ' ", " \` ") followed by '_' and the first character, follow the pattern til the end of the string, to end the string put '_' and a marker (' " ', " ' ", " \` ")

Example Usage:   
```spOo0O_00oo_Oo0o0_OOooo_OOooo_OoO0_Ooo0o_OOoOo_OOo0o_OOooo_Oo0oO_Oo0o_Oo0On``` would be the string "Hello World!"

To print it simply add the stdout key word (```00000```) before and after it:   
```sp00000-Oo0O_00oo_Oo0o0_OOooo_OOooo_OoO0_Ooo0o_OOoOo_OOo0o_OOooo_Oo0oO_Oo0o_Oo0O-00000n```

---

### 


---

### 


---
