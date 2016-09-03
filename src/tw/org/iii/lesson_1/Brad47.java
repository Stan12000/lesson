 p a c k a g e   t w . o r g . i i i . l e s s o n _ 1 ;  
  
 i m p o r t   j a v a . i o . F i l e ;  
 i m p o r t   j a v a . i o . F i l e I n p u t S t r e a m ;  
 i m p o r t   j a v a . i o . F i l e N o t F o u n d E x c e p t i o n ;  
 i m p o r t   j a v a . i o . I O E x c e p t i o n ;  
 
//測試一下

 p u b l i c   c l a s s   B r a d 4 7 {  
  
 	 p u b l i c   s t a t i c   v o i d   m a i n ( S t r i n g [ ]   a r g s )   {  
 	 	 / /   T O D O   A u t o - g e n e r a t e d   m e t h o d   s t u b  
  
  
 	 	 F i l e   f 1   =   n e w   F i l e ( " d i r 1 / b r a d 0 1 . t x t " ) ;  
 	 	 l o n g   l e n   = f 1 . l e n g t h ( ) ;  
 	 	  
 	 	 t r y   {  
 	 	 	 F i l e I n p u t S t r e a m   f i n   = n e w   F i l e I n p u t S t r e a m ( f 1 ) ;  
 	 	 	 i n t   c   ;   b y t e [ ]   t e m p   =   n e w   b y t e [ ( i n t ) l e n ] ;  
 	 	 	 f i n . r e a d ( t e m p ) ;  
 	 	 	 S y s t e m . o u t . p r i n t l n ( n e w   S t r i n g ( t e m p ) ) ;  
 	 	 	  
 	 	 / / 	 w h i l e ( ( c = f i n . r e a d ( t e m p ) ) ! = - 1 ) {  
 	 	 / / 	 	 S y s t e m . o u t . p r i n t ( n e w   S t r i n g ( t e m p , 0 , c ) ) ;  
 	 	 / / 	 }  
 	 	 	  
 	 	 	  
 	 	 	 f i n . c l o s e ( ) ;  
 	 	 	 S y s t e m . o u t . p r i n t l n ( " O K " ) ;  
 	 	 }   c a t c h   ( F i l e N o t F o u n d E x c e p t i o n   e )   {  
 	 	 	 S y s t e m . o u t . p r i n t l n ( e . t o S t r i n g ( ) ) ;  
 	 	 } c a t c h ( I O E x c e p t i o n   e ) {  
 	 	 	 S y s t e m . o u t . p r i n t l n ( e . t o S t r i n g ( ) ) ;  
 	 	 }  
 	 	  
 	  
 	 	  
 	 }  
  
 }  
