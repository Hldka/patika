Aşağıdaki sorgu senaryolarını dvdrental örnek veri tabanı üzerinden gerçekleştiriniz.

film tablosunda bulunan title ve description sütunlarındaki verileri sıralayınız.
film tablosunda bulunan tüm sütunlardaki verileri film uzunluğu (length) 60 dan büyük VE 75 ten küçük olma koşullarıyla sıralayınız.
film tablosunda bulunan tüm sütunlardaki verileri rental_rate 0.99 VE replacement_cost 12.99 VEYA 28.99 olma koşullarıyla sıralayınız.
customer tablosunda bulunan first_name sütunundaki değeri 'Mary' olan müşterinin last_name sütunundaki değeri nedir?
film tablosundaki uzunluğu(length) 50 ten büyük OLMAYIP aynı zamanda rental_rate değeri 2.99 veya 4.99 OLMAYAN verileri sıralayınız.

cvp1 )SELECT title ,description FROM dvdrental;
cvp2) SELECT *FROM dvdrental where film uzunlugu(length)>60 and film uzunlugu(length)<75;
cvp3)SELECT*FROM dvdrental WHERE in(rental_rate=0.99 and replacement_cost=12.99 or replacement =28.99);
CVP4)SELECT customer FROM dvdrental WHERE first_name='Mary';
cvp5) SELECT film FROM dvdrental WHERE uzunlugu(length)<50 and rental_rate!=2.99 or rental_rate!=4.99;
