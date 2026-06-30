package icu.samnyan.aqua.sega.ongeki.model.userdata;

import java.lang.Throwable;
import java.lang.IllegalStateException;
import org.junit.Test;
import org.junit.Rule;
import org.junit.rules.Timeout;
import java.util.concurrent.TimeUnit;
import org.junit.Before;
import java.lang.Class;
import java.lang.reflect.Method;
import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.stream.Stream;
import java.util.stream.Collectors;
import static icu.samnyan.aqua.sega.ongeki.model.userdata.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.lang.Object;
import java.lang.Long;
import java.lang.Integer;

public class UserChapter_setLastPlayMusicCategory_208495029816 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term90562;
     Object term90836;

    public UserChapter_setLastPlayMusicCategory_208495029816() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Long term90568 = new Long(8863790908271299748L);
        term90562 = newInstance(Class.forName("icu.samnyan.aqua.sega.ongeki.model.userdata.UserChapter"));
        Object term90564 = newInstance(Class.forName("icu.samnyan.aqua.sega.ongeki.model.userdata.UserData"));
        Object term90566 = newInstance(Class.forName("icu.samnyan.aqua.sega.general.model.Card"));
        Object term90582 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term90583 = newInstance(Class.forName("java.time.LocalDate"));
        Object term90587 = newInstance(Class.forName("java.time.LocalTime"));
        Object term90592 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term90593 = newInstance(Class.forName("java.time.LocalDate"));
        Object term90597 = newInstance(Class.forName("java.time.LocalTime"));
        setLongField(term90562, term90562.getClass(), "id", -5424368208557469536L);
        setLongField(term90564, term90564.getClass(), "id", 435548678489866377L);
        setLongField(term90566, term90566.getClass(), "id", 8028694960701964650L);
        setField(term90566, term90566.getClass(), "extId", term90568);
        setField(term90566, term90566.getClass(), "luid", "jJzyVCBtLl");
        setIntField(term90583, term90583.getClass(), "year", 2025);
        setShortField(term90583, term90583.getClass(), "month", (short) 9);
        setShortField(term90583, term90583.getClass(), "day", (short) 5);
        setField(term90582, term90582.getClass(), "date", term90583);
        setByteField(term90587, term90587.getClass(), "hour", (byte) 11);
        setByteField(term90587, term90587.getClass(), "minute", (byte) 59);
        setByteField(term90587, term90587.getClass(), "second", (byte) 37);
        setIntField(term90587, term90587.getClass(), "nano", 93740487);
        setField(term90582, term90582.getClass(), "time", term90587);
        setField(term90566, term90566.getClass(), "registerTime", term90582);
        setIntField(term90593, term90593.getClass(), "year", 2028);
        setShortField(term90593, term90593.getClass(), "month", (short) 12);
        setShortField(term90593, term90593.getClass(), "day", (short) 28);
        setField(term90592, term90592.getClass(), "date", term90593);
        setByteField(term90597, term90597.getClass(), "hour", (byte) 11);
        setByteField(term90597, term90597.getClass(), "minute", (byte) 37);
        setByteField(term90597, term90597.getClass(), "second", (byte) 0);
        setIntField(term90597, term90597.getClass(), "nano", 315383282);
        setField(term90592, term90592.getClass(), "time", term90597);
        setField(term90566, term90566.getClass(), "accessTime", term90592);
        setField(term90564, term90564.getClass(), "card", term90566);
        setField(term90564, term90564.getClass(), "userName", "MZPPOYZzth");
        setIntField(term90564, term90564.getClass(), "level", 598259983);
        setIntField(term90564, term90564.getClass(), "reincarnationNum", 283054332);
        setLongField(term90564, term90564.getClass(), "exp", 1494597033123043894L);
        setLongField(term90564, term90564.getClass(), "point", 4845831205860874631L);
        setLongField(term90564, term90564.getClass(), "totalPoint", 5619082245648337L);
        setIntField(term90564, term90564.getClass(), "playCount", 627879820);
        setIntField(term90564, term90564.getClass(), "jewelCount", -40238432);
        setIntField(term90564, term90564.getClass(), "totalJewelCount", -263665532);
        setIntField(term90564, term90564.getClass(), "medalCount", -662026247);
        setIntField(term90564, term90564.getClass(), "playerRating", -549576351);
        setIntField(term90564, term90564.getClass(), "highestRating", 903450678);
        setIntField(term90564, term90564.getClass(), "battlePoint", -923344894);
        setIntField(term90564, term90564.getClass(), "bestBattlePoint", 1165279948);
        setIntField(term90564, term90564.getClass(), "overDamageBattlePoint", 842516803);
        setBooleanField(term90564, term90564.getClass(), "isDialogWatchedSuggestMemory", false);
        setIntField(term90564, term90564.getClass(), "nameplateId", -1562310043);
        setIntField(term90564, term90564.getClass(), "trophyId", 57936993);
        setIntField(term90564, term90564.getClass(), "cardId", -1963541241);
        setIntField(term90564, term90564.getClass(), "characterId", 148495350);
        setIntField(term90564, term90564.getClass(), "characterVoiceNo", 258478328);
        setIntField(term90564, term90564.getClass(), "tabSetting", 1079181683);
        setIntField(term90564, term90564.getClass(), "tabSortSetting", 62795043);
        setIntField(term90564, term90564.getClass(), "cardCategorySetting", 700442161);
        setIntField(term90564, term90564.getClass(), "cardSortSetting", 1901393171);
        setIntField(term90564, term90564.getClass(), "rivalScoreCategorySetting", -1708841585);
        setIntField(term90564, term90564.getClass(), "playedTutorialBit", -704298059);
        setIntField(term90564, term90564.getClass(), "firstTutorialCancelNum", 1963830726);
        setLongField(term90564, term90564.getClass(), "sumTechHighScore", -3205097648010513714L);
        setLongField(term90564, term90564.getClass(), "sumTechBasicHighScore", 647529118477173582L);
        setLongField(term90564, term90564.getClass(), "sumTechAdvancedHighScore", 8514958211276986056L);
        setLongField(term90564, term90564.getClass(), "sumTechExpertHighScore", 7840187170802911337L);
        setLongField(term90564, term90564.getClass(), "sumTechMasterHighScore", -3357290797044326032L);
        setLongField(term90564, term90564.getClass(), "sumTechLunaticHighScore", -1613238650738241777L);
        setLongField(term90564, term90564.getClass(), "sumBattleHighScore", 2019526907355663418L);
        setLongField(term90564, term90564.getClass(), "sumBattleBasicHighScore", -2609505910844755971L);
        setLongField(term90564, term90564.getClass(), "sumBattleAdvancedHighScore", -6795948198960798378L);
        setLongField(term90564, term90564.getClass(), "sumBattleExpertHighScore", 4909606338440519591L);
        setLongField(term90564, term90564.getClass(), "sumBattleMasterHighScore", 2671288000113702709L);
        setLongField(term90564, term90564.getClass(), "sumBattleLunaticHighScore", -6039086577198085286L);
        setField(term90564, term90564.getClass(), "eventWatchedDate", "pxFICtkwAB");
        setField(term90564, term90564.getClass(), "cmEventWatchedDate", "MrgAxXXbMg");
        setField(term90564, term90564.getClass(), "firstGameId", "ZmwRRoQNPl");
        setField(term90564, term90564.getClass(), "firstRomVersion", "prNciwKNKW");
        setField(term90564, term90564.getClass(), "firstDataVersion", "VtfNPRNIuG");
        setField(term90564, term90564.getClass(), "firstPlayDate", "ttqikiUUcN");
        setField(term90564, term90564.getClass(), "lastGameId", "NiLxAEvTVO");
        setField(term90564, term90564.getClass(), "lastRomVersion", "SffiObxUZK");
        setField(term90564, term90564.getClass(), "lastDataVersion", "uzPbXEJVpP");
        setField(term90564, term90564.getClass(), "compatibleCmVersion", "vDorZRqjUi");
        setField(term90564, term90564.getClass(), "lastPlayDate", "pTjttMNuyX");
        setIntField(term90564, term90564.getClass(), "lastPlaceId", -1467028089);
        setField(term90564, term90564.getClass(), "lastPlaceName", "fFPyzrPhJi");
        setIntField(term90564, term90564.getClass(), "lastRegionId", -714190515);
        setField(term90564, term90564.getClass(), "lastRegionName", "tiYwzLkwHD");
        setIntField(term90564, term90564.getClass(), "lastAllNetId", 492120544);
        setField(term90564, term90564.getClass(), "lastClientId", "vHPMbWTklV");
        setIntField(term90564, term90564.getClass(), "lastUsedDeckId", -832143098);
        setIntField(term90564, term90564.getClass(), "lastPlayMusicLevel", 919518312);
        setIntField(term90564, term90564.getClass(), "lastEmoneyBrand", 363743117);
        setField(term90562, term90562.getClass(), "user", term90564);
        setIntField(term90562, term90562.getClass(), "chapterId", -1659784438);
        setIntField(term90562, term90562.getClass(), "jewelCount", -1912629150);
        setIntField(term90562, term90562.getClass(), "lastPlayMusicCategory", 593205725);
        setIntField(term90562, term90562.getClass(), "lastPlayMusicId", -482661954);
        setIntField(term90562, term90562.getClass(), "lastPlayMusicLevel", -1449003566);
        setBooleanField(term90562, term90562.getClass(), "isStoryWatched", false);
        setBooleanField(term90562, term90562.getClass(), "isClear", true);
        setIntField(term90562, term90562.getClass(), "skipTiming1", -649826731);
        setIntField(term90562, term90562.getClass(), "skipTiming2", 506165302);
        term90836 = new Integer(932736092);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.ongeki.model.userdata.UserChapter");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = int.class;
        Object[] args = new Object[1];
        args[0] = term90836;
        callMethod(klass, "setLastPlayMusicCategory", argTypes, term90562, args);
    }

};


