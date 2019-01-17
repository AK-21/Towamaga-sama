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
		/* LABEL_EXIT */			"Czy na pewno chcesz wyjœæ z gry?",
		/* LABEL_SAVE */			"Zapisz jako:",
		/* LABEL_OVERWRITE */		"Zapis istnieje! Nadpisaæ?",
		/* LABEL_MENU */			"Co chcesz zrobiæ?",
		/* LABEL_SAVE_SUCCESS */	"Stan gry zosta³ zapisany!",
		/* WARN_EMPTY */			"Musisz podaæ nazwê zapisu!",
		/* WARN_TOO_LONG */			"Podana nazwa jest zbyt d³uga!",
		/* BTN_YES */				"Tak",
		/* BTN_NO */				"Nie",
		/* BTN_SAVE */				"Zapisz",
		/* BTN_CANCEL */			"Anuluj",
		/* BTN_OK */				"OK",
		/* BTN_EXIT */				"WyjdŸ",
		/* BTN_CONTINUE */			"Kontynuuj"
	};
	
	private String[] vAbilitiesPl = new String[]
	{
		/* ATK_DEFAULT_NAME */		"Zwyk³y atak",
		/* ATK_SHURIKEN_NAME */		"Rzut shurikenem",
		/* ATK_STRONG_NAME */		"Silny atak",
		/* ATK_CUTS_NAME */			"Seria szybkich ciêæ",
		/* ATK_SHIZAN_NAME */		"Tameshigiri",
		/* ATK_KESAGAKE_NAME */		"Kesagake",
		/* ATK_WRATH_NAME */		"Gniew Towamagi",
		/* ATK_CLAWS_NAME */		"Szpony Oni",
		/* HEAL_DEFAULT_NAME */		"Leczenie",
		/* HEAL_GREAT_NAME */		"Uzdrowienie",
		/* HEAL_RICE_NAME */		"Porcja ry¿u",
		/* HEAL_SAKE_NAME */		"£yk sake",
		/* HEAL_SUSHI_NAME */		"Wzmacniaj¹ce sushi"
	};
	
	private String[] vCreditsPl = new String[]
	{
		/* CR_AME_H */		"",
		/* CR_AME_L1 */		"By³a to prezentacja mo¿liwoœci",
		/* CR_AME_L2 */		"technologii AmeEnjin w wersji 0.2",
		/* CR_AUTHOR_H */	"Projekt i realizacja",
		/* CR_AUTHOR_L1 */	"Arkadiusz Kostyra",
		/* CR_LIB_H */		"AmeEnjin v0.2 wykorzystuje biblioteki:",
		/* CR_LIB_L1 */		"LWJGL 2 (BSD license)",
		/* CR_LIB_L2 */		"Slick-Util (BSD license)",
		/* CR_LIB_L3 */		"uJavniacz (MIT license)",
		/* CR_FNT_H */		"U¿yte czcionki:",
		/* CR_FNT_L1 */		"Fira Sans",
		/* CR_FNT_L2 */		"Honoka Antique Kaku"
	};

	
	private String[] vIntroPl = new String[]
	{
		"Lokalne konflikty, waœnie rodowe, nieustanna walka o dominacjê...",
		"Wielki wojownik, pan Towamaga, postanowi³ po³o¿yæ temu kres.",
		"Po d³ugich walkach zdo³a³ podporz¹dkowaæ sobie ca³y kraj.",
		"Kolejne lata despotycznych rz¹dów pozwoli³y mu ostatecznie z³amaæ wszelki opór.",
		"Pod w³adz¹ okrutnego tyrana, w krainie zapanowa³ d³ugo wyczekiwany pokój."
	};
	
	private String[] vScrPl = new String[]
	{
		/* SCR_PRE_INTRO */			"Nie by³y to spokojne czasy...",
		/* SCR_POST_INTRO */		"A¿ do tego dnia...",
		
		/* SCR_TRY_AGAIN */			"Naciœnij ENTER, aby spróbowaæ ponownie",
		/* SCR_END */				"Koniec wersji DEMO",
		/* SCR_PRESS_TO_EXIT */		"Naciœnij ENTER, aby zakoñczyæ grê",
		/* SCR_BATTLE_1 */			"Walka siê rozpoczyna!",
		/* SCR_BATTLE_2 */			"PotwierdŸ gotowoœæ, wciskaj¹c ENTER"
	};
	
	private String[] vDiaPl = new String[]
	{
		/* DIA_BEGIN_01_TOWAMAGA */		"Ach! Co¿ za wspania³y dzieñ!",
		/* DIA_BEGIN_02_TOWAMAGA */		"Uwielbiam takie spokojne dni, gdy nic siê nie dzieje!",
		/* DIA_BEGIN_03_HIRO */			"Strze¿ siê, Towamaga! Dziœ zakoñcz¹ siê twoje rz¹dy!",
		/* DIA_BEGIN_04_TOWAMAGA */		"Co? Kim jesteœ? I jakim prawem zak³ócasz mój spokój?",
		/* DIA_BEGIN_05_HIRO */			"Jam jest Hiro z rodu Ainide! Przybywam, aby rzuciæ ci wyzwanie!",
		/* DIA_BEGIN_06_HIRO */			"Pokonam ciê! Przywrócê wolnoœæ tej krainie i dokoñczê to, co nie uda³o siê mojemu ojcu wiele lat temu!", 
		/* DIA_BEGIN_07_TOWAMAGA */		"Ach, m³ody Hiro... Ty nic nie rozumiesz!",
		/* DIA_BEGIN_08_TOWAMAGA */		"To JA jestem twoim ojcem!",
		/* DIA_BEGIN_09_HIRO */			"...naprawdê...?",
		/* DIA_BEGIN_10_TOWAMAGA */		"Nie.",
		/* DIA_BEGIN_11_TOWAMAGA */		"Ha ha! Tak ³atwo ciê zdekoncentrowaæ!",		
		/* DIA_BEGIN_12_TOWAMAGA */		"Nie jesteœ jeszcze gotów do walki ze mn¹! IdŸ precz!",
		/* DIA_BEGIN_13_HIRO */			"A ty...",
		/* DIA_BEGIN_14_HIRO */			"... jesteœ G£UPI!",
		/* DIA_BEGIN_15_TOWAMAGA */		"Jak œmiesz mnie tak obra¿aæ?!",
		/* DIA_BEGIN_16_TOWAMAGA */		"Taka zuchwa³oœæ zas³uguje na karê! GIÑ!!!",
		
		/* DIA_LOSE_01_HIRO */			"Przegra³em... Wszystko stracone...",
		
		/* DIA_VICTORY_01_HIRO */		"To twój koniec, Towamaga!",
		/* DIA_VICTORY_02_TOWAMAGA */	"Jak mog³em tak przegraæ? To nie mo¿e byæ prawda!",
		/* DIA_VICTORY_03_HIRO */		"Uda³o mi siê! Uwolni³em kraj od okrutnego tyrana!",
		/* DIA_VICTORY_04_HIRO */		"Chyba zas³u¿y³em sobie na chwilê odpoczynku...",
		
		/* DIA_LAST_01_HIRO */			"Tak oto z³o zosta³o pokonane...",
		/* DIA_LAST_02_HIRO */			"Tyle lat treningów i wyrzeczeñ...",
		/* DIA_LAST_03_HIRO */			"... a wystarczy³o wklepywaæ literki... ehhh...",
	};
}
