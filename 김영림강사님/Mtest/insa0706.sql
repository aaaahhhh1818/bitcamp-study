SQL> select * from insa;

     SABUN NAME                 BUSE                                            
---------- -------------------- ----------------------------------------        
      1100 aaa                  ggg                                             
      2200 bbb                  xxxx                                            
      4400 ddd                  bbbbb                                           
      5500 eee                  wwww                                            
       778 ±¹¹Î                 ½ºÅ¸                                            
      7718 bd                   ddd                                             

6 rows selected.

SQL> select rownum, sabun, name, buse from insa;

    ROWNUM      SABUN NAME                                                      
---------- ---------- --------------------                                      
BUSE                                                                            
----------------------------------------                                        
         1       1100 aaa                                                       
ggg                                                                             
                                                                                
         2       2200 bbb                                                       
xxxx                                                                            
                                                                                
         3       4400 ddd                                                       
bbbbb                                                                           
                                                                                

    ROWNUM      SABUN NAME                                                      
---------- ---------- --------------------                                      
BUSE                                                                            
----------------------------------------                                        
         4       5500 eee                                                       
wwww                                                                            
                                                                                
         5        778 ±¹¹Î                                                      
½ºÅ¸                                                                            
                                                                                
         6       7718 bd                                                        
ddd                                                                             
                                                                                

6 rows selected.

SQL> delete from insa where sabun = 7718;

1 row deleted.

SQL> select rownum, sabun, name, buse from insa;

    ROWNUM      SABUN NAME                                                      
---------- ---------- --------------------                                      
BUSE                                                                            
----------------------------------------                                        
         1       1100 aaa                                                       
ggg                                                                             
                                                                                
         2       2200 bbb                                                       
xxxx                                                                            
                                                                                
         3       4400 ddd                                                       
bbbbb                                                                           
                                                                                

    ROWNUM      SABUN NAME                                                      
---------- ---------- --------------------                                      
BUSE                                                                            
----------------------------------------                                        
         4       5500 eee                                                       
wwww                                                                            
                                                                                
         5        778 ±¹¹Î                                                      
½ºÅ¸                                                                            
                                                                                

SQL> set pagesize 2300
SQL> set linesize 2300
SQL> select rownum, sabun, name, buse from insa;

    ROWNUM      SABUN NAME                 BUSE                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                             
---------- ---------- -------------------- ----------------------------------------                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                         
         1       1100 aaa                  ggg                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                              
         2       2200 bbb                  xxxx                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                             
         3       4400 ddd                  bbbbb                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                            
         4       5500 eee                  wwww                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                             
         5        778 ±¹¹Î                 ½ºÅ¸                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                             

SQL> insert into insa(sabun, name, buse) values( 7775, 'LA', 'LB');

1 row created.

SQL> insert into insa(sabun, name, buse) values( 7775, 'LA', 'LB');
insert into insa(sabun, name, buse) values( 7775, 'LA', 'LB')
*
ERROR at line 1:
ORA-00001: unique constraint (SYSTEM.SYS_C007032) violated 


SQL> insert into insa(sabun, name, buse) values( 2200, 'LA', 'LB');
insert into insa(sabun, name, buse) values( 2200, 'LA', 'LB')
*
ERROR at line 1:
ORA-00001: unique constraint (SYSTEM.SYS_C007032) violated 


SQL> insert into insa(sabun, name, buse) values( 223, 'LA', 'LB');

1 row created.

SQL> spool off
