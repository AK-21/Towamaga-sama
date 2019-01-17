package demo;

public class PLTextContainer extends TextContainer
{
	PLTextContainer()
	{
		super();
		setSysTextArr(vSysPl);
		setAbilitiesTextArr(vAbilitiesPl);
		setIntro(vIntroPl);
		setScrTextArr(vScrPl);
		setDiaTextArr(vDiaPl);
		setCreditsTextArr(vCreditsPl);
		
	}
	
	private String[] vSysPl = new String[]
	{
		/* LABEL_EXIT */			"Czy na pewno chcesz wyj�� z gry?",
		/* LABEL_SAVE */			"Zapisz jako:",
		/* LABEL_OVERWRITE */		"Zapis istnieje! Nadpisa�?",
		/* LABEL_MENU */			"Co chcesz zrobi�?",
		/* LABEL_SAVE_SUCCESS */	"Stan gry zosta� zapisany!",
		/* WARN_EMPTY */			"Musisz poda� nazw� zapisu!",
		/* WARN_TOO_LONG */			"Podana nazwa jest zbyt d�uga!",
		/* BTN_YES */				"Tak",
		/* BTN_NO */				"Nie",
		/* BTN_SAVE */				"Zapisz",
		/* BTN_CANCEL */			"Anuluj",
		/* BTN_OK */				"OK",
		/* BTN_EXIT */				"Wyjd�",
		/* BTN_CONTINUE */			"Kontynuuj"
	};
	
	private String[] vAbilitiesPl = new String[]
	{
		/* ATK_DEFAULT_NAME */		"Zwyk�y atak",
		/* ATK_SHURIKEN_NAME */		"Rzut shurikenem",
		/* ATK_STRONG_NAME */		"Silny atak",
		/* ATK_CUTS_NAME */			"Seria szybkich ci��",
		/* ATK_SHIZAN_NAME */		"Tameshigiri",
		/* ATK_KESAGAKE_NAME */		"Kesagake",
		/* ATK_WRATH_NAME */		"Gniew Towamagi",
		/* ATK_CLAWS_NAME */		"Szpony Oni",
		/* HEAL_DEFAULT_NAME */		"Leczenie",
		/* HEAL_GREAT_NAME */		"Uzdrowienie",
		/* HEAL_RICE_NAME */		"Porcja ry�u",
		/* HEAL_SAKE_NAME */		"�yk sake",
		/* HEAL_SUSHI_NAME */		"Wzmacniaj�ce sushi"
	};
	
	private String[] vCreditsPl = new String[]
	{
		/* CR_AME_H */		"",
		/* CR_AME_L1 */		"By�a to prezentacja mo�liwo�ci",
		/* CR_AME_L2 */		"technologii AmeEnjin w wersji 0.2",
		/* CR_AUTHOR_H */	"Projekt i realizacja",
		/* CR_AUTHOR_L1 */	"Arkadiusz Kostyra",
		/* CR_LIB_H */		"AmeEnjin v0.2 wykorzystuje biblioteki:",
		/* CR_LIB_L1 */		"LWJGL 2 (BSD license)",
		/* CR_LIB_L2 */		"Slick-Util (BSD license)",
		/* CR_LIB_L3 */		"uJavniacz (MIT license)",
		/* CR_FNT_H */		"U�yte czcionki:",
		/* CR_FNT_L1 */		"Fira Sans",
		/* CR_FNT_L2 */		"Honoka Antique Kaku"
	};

	
	private String[] vIntroPl = new String[]
	{
		"Lokalne konflikty, wa�nie rodowe, nieustanna walka o dominacj�...",
		"Wielki wojownik, pan Towamaga, postanowi� po�o�y� temu kres.",
		"Po d�ugich walkach zdo�a� podporz�dkowa� sobie ca�y kraj.",
		"Kolejne lata despotycznych rz�d�w pozwoli�y mu ostatecznie z�ama� wszelki op�r.",
		"Pod w�adz� okrutnego tyrana, w krainie zapanowa� d�ugo wyczekiwany pok�j."
	};
	
	private String[] vScrPl = new String[]
	{
		/* SCR_PRE_INTRO */			"Nie by�y to spokojne czasy...",
		/* SCR_POST_INTRO */		"A� do tego dnia...",
		
		/* SCR_TRY_AGAIN */			"Naci�nij ENTER, aby spr�bowa� ponownie",
		/* SCR_END */				"Koniec wersji DEMO",
		/* SCR_PRESS_TO_EXIT */		"Naci�nij ENTER, aby zako�czy� gr�",
		/* SCR_BATTLE_1 */			"Walka si� rozpoczyna!",
		/* SCR_BATTLE_2 */			"Potwierd� gotowo��, wciskaj�c ENTER"
	};
	
	private String[] vDiaPl = new String[]
	{
		/* DIA_BEGIN_01_TOWAMAGA */		"Ach! Co� za wspania�y dzie�!",
		/* DIA_BEGIN_02_TOWAMAGA */		"Uwielbiam takie spokojne dni, gdy nic si� nie dzieje!",
		/* DIA_BEGIN_03_HIRO */			"Strze� si�, Towamaga! Dzi� zako�cz� si� twoje rz�dy!",
		/* DIA_BEGIN_04_TOWAMAGA */		"Co? Kim jeste�? I jakim prawem zak��casz m�j spok�j?",
		/* DIA_BEGIN_05_HIRO */			"Jam jest Hiro z rodu Ainide! Przybywam, aby rzuci� ci wyzwanie!",
		/* DIA_BEGIN_06_HIRO */			"Pokonam ci�! Przywr�c� wolno�� tej krainie i doko�cz� to, co nie uda�o si� mojemu ojcu wiele lat temu!", 
		/* DIA_BEGIN_07_TOWAMAGA */		"Ach, m�ody Hiro... Ty nic nie rozumiesz!",
		/* DIA_BEGIN_08_TOWAMAGA */		"To JA jestem twoim ojcem!",
		/* DIA_BEGIN_09_HIRO */			"...naprawd�...?",
		/* DIA_BEGIN_10_TOWAMAGA */		"Nie.",
		/* DIA_BEGIN_11_TOWAMAGA */		"Ha ha! Tak �atwo ci� zdekoncentrowa�!",		
		/* DIA_BEGIN_12_TOWAMAGA */		"Nie jeste� jeszcze got�w do walki ze mn�! Id� precz!",
		/* DIA_BEGIN_13_HIRO */			"A ty...",
		/* DIA_BEGIN_14_HIRO */			"... jeste� G�UPI!",
		/* DIA_BEGIN_15_TOWAMAGA */		"Jak �miesz mnie tak obra�a�?!",
		/* DIA_BEGIN_16_TOWAMAGA */		"Taka zuchwa�o�� zas�uguje na kar�! GI�!!!",
		
		/* DIA_LOSE_01_HIRO */			"Przegra�em... Wszystko stracone...",
		
		/* DIA_VICTORY_01_HIRO */		"To tw�j koniec, Towamaga!",
		/* DIA_VICTORY_02_TOWAMAGA */	"Jak mog�em tak przegra�? To nie mo�e by� prawda!",
		/* DIA_VICTORY_03_HIRO */		"Uda�o mi si�! Uwolni�em kraj od okrutnego tyrana!",
		/* DIA_VICTORY_04_HIRO */		"Chyba zas�u�y�em sobie na chwil� odpoczynku...",
		
		/* DIA_LAST_01_HIRO */			"Tak oto z�o zosta�o pokonane...",
		/* DIA_LAST_02_HIRO */			"Tyle lat trening�w i wyrzecze�...",
		/* DIA_LAST_03_HIRO */			"... a wystarczy�o wklepywa� literki... ehhh...",
	};
}
