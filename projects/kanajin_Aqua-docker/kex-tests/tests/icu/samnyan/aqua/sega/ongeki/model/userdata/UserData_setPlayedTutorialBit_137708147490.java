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

public class UserData_setPlayedTutorialBit_137708147490 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term60108;
     Object term60371;

    public UserData_setPlayedTutorialBit_137708147490() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Long term60112 = new Long(-7115418542247301000L);
        term60108 = newInstance(Class.forName("icu.samnyan.aqua.sega.ongeki.model.userdata.UserData"));
        Object term60110 = newInstance(Class.forName("icu.samnyan.aqua.sega.general.model.Card"));
        Object term60126 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term60127 = newInstance(Class.forName("java.time.LocalDate"));
        Object term60131 = newInstance(Class.forName("java.time.LocalTime"));
        Object term60136 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term60137 = newInstance(Class.forName("java.time.LocalDate"));
        Object term60141 = newInstance(Class.forName("java.time.LocalTime"));
        setLongField(term60108, term60108.getClass(), "id", -2012019122711382177L);
        setLongField(term60110, term60110.getClass(), "id", -6278768630298938602L);
        setField(term60110, term60110.getClass(), "extId", term60112);
        setField(term60110, term60110.getClass(), "luid", "mPQmjoknqi");
        setIntField(term60127, term60127.getClass(), "year", 2016);
        setShortField(term60127, term60127.getClass(), "month", (short) 1);
        setShortField(term60127, term60127.getClass(), "day", (short) 24);
        setField(term60126, term60126.getClass(), "date", term60127);
        setByteField(term60131, term60131.getClass(), "hour", (byte) 23);
        setByteField(term60131, term60131.getClass(), "minute", (byte) 15);
        setByteField(term60131, term60131.getClass(), "second", (byte) 43);
        setIntField(term60131, term60131.getClass(), "nano", 860277753);
        setField(term60126, term60126.getClass(), "time", term60131);
        setField(term60110, term60110.getClass(), "registerTime", term60126);
        setIntField(term60137, term60137.getClass(), "year", 2016);
        setShortField(term60137, term60137.getClass(), "month", (short) 2);
        setShortField(term60137, term60137.getClass(), "day", (short) 2);
        setField(term60136, term60136.getClass(), "date", term60137);
        setByteField(term60141, term60141.getClass(), "hour", (byte) 16);
        setByteField(term60141, term60141.getClass(), "minute", (byte) 51);
        setByteField(term60141, term60141.getClass(), "second", (byte) 8);
        setIntField(term60141, term60141.getClass(), "nano", 991355221);
        setField(term60136, term60136.getClass(), "time", term60141);
        setField(term60110, term60110.getClass(), "accessTime", term60136);
        setField(term60108, term60108.getClass(), "card", term60110);
        setField(term60108, term60108.getClass(), "userName", "gLgvePQRQT");
        setIntField(term60108, term60108.getClass(), "level", -2026011046);
        setIntField(term60108, term60108.getClass(), "reincarnationNum", -930966430);
        setLongField(term60108, term60108.getClass(), "exp", -7332230070564634620L);
        setLongField(term60108, term60108.getClass(), "point", -1514321226080897639L);
        setLongField(term60108, term60108.getClass(), "totalPoint", 3335901515267393294L);
        setIntField(term60108, term60108.getClass(), "playCount", -1137340653);
        setIntField(term60108, term60108.getClass(), "jewelCount", -520048649);
        setIntField(term60108, term60108.getClass(), "totalJewelCount", -39379486);
        setIntField(term60108, term60108.getClass(), "medalCount", 92637602);
        setIntField(term60108, term60108.getClass(), "playerRating", -702644184);
        setIntField(term60108, term60108.getClass(), "highestRating", 873158899);
        setIntField(term60108, term60108.getClass(), "battlePoint", -939494687);
        setIntField(term60108, term60108.getClass(), "bestBattlePoint", 1818886574);
        setIntField(term60108, term60108.getClass(), "overDamageBattlePoint", -1082194143);
        setBooleanField(term60108, term60108.getClass(), "isDialogWatchedSuggestMemory", true);
        setIntField(term60108, term60108.getClass(), "nameplateId", 1109687027);
        setIntField(term60108, term60108.getClass(), "trophyId", -1583077425);
        setIntField(term60108, term60108.getClass(), "cardId", -1058283823);
        setIntField(term60108, term60108.getClass(), "characterId", -1620576583);
        setIntField(term60108, term60108.getClass(), "characterVoiceNo", -1365748841);
        setIntField(term60108, term60108.getClass(), "tabSetting", 1223391792);
        setIntField(term60108, term60108.getClass(), "tabSortSetting", -1134943583);
        setIntField(term60108, term60108.getClass(), "cardCategorySetting", -694277686);
        setIntField(term60108, term60108.getClass(), "cardSortSetting", -2044994445);
        setIntField(term60108, term60108.getClass(), "rivalScoreCategorySetting", -883941371);
        setIntField(term60108, term60108.getClass(), "playedTutorialBit", -1545047968);
        setIntField(term60108, term60108.getClass(), "firstTutorialCancelNum", 665116636);
        setLongField(term60108, term60108.getClass(), "sumTechHighScore", 7450604331368897074L);
        setLongField(term60108, term60108.getClass(), "sumTechBasicHighScore", 9082900970492935893L);
        setLongField(term60108, term60108.getClass(), "sumTechAdvancedHighScore", -2789586359029154063L);
        setLongField(term60108, term60108.getClass(), "sumTechExpertHighScore", -8881948301533552645L);
        setLongField(term60108, term60108.getClass(), "sumTechMasterHighScore", -5901794166643398646L);
        setLongField(term60108, term60108.getClass(), "sumTechLunaticHighScore", -7004623571860693586L);
        setLongField(term60108, term60108.getClass(), "sumBattleHighScore", -211624102263089228L);
        setLongField(term60108, term60108.getClass(), "sumBattleBasicHighScore", 4996387614529657386L);
        setLongField(term60108, term60108.getClass(), "sumBattleAdvancedHighScore", -1790513623283498924L);
        setLongField(term60108, term60108.getClass(), "sumBattleExpertHighScore", -1912576404767694975L);
        setLongField(term60108, term60108.getClass(), "sumBattleMasterHighScore", -647526387338349350L);
        setLongField(term60108, term60108.getClass(), "sumBattleLunaticHighScore", -5497138014320467810L);
        setField(term60108, term60108.getClass(), "eventWatchedDate", "SCmsfHIEPK");
        setField(term60108, term60108.getClass(), "cmEventWatchedDate", "dFOuezLNWb");
        setField(term60108, term60108.getClass(), "firstGameId", "PUWJnLuyiR");
        setField(term60108, term60108.getClass(), "firstRomVersion", "ADhJCRgHaS");
        setField(term60108, term60108.getClass(), "firstDataVersion", "qociGUMzem");
        setField(term60108, term60108.getClass(), "firstPlayDate", "HHAfSjIdNi");
        setField(term60108, term60108.getClass(), "lastGameId", "oTqQEKklHi");
        setField(term60108, term60108.getClass(), "lastRomVersion", "riyKkxMvWm");
        setField(term60108, term60108.getClass(), "lastDataVersion", "WENnGcBSTd");
        setField(term60108, term60108.getClass(), "compatibleCmVersion", "juEYcOCxLW");
        setField(term60108, term60108.getClass(), "lastPlayDate", "YsWgGEhEmC");
        setIntField(term60108, term60108.getClass(), "lastPlaceId", 1255353874);
        setField(term60108, term60108.getClass(), "lastPlaceName", "PBcepqkBBV");
        setIntField(term60108, term60108.getClass(), "lastRegionId", 550111365);
        setField(term60108, term60108.getClass(), "lastRegionName", "mukHRKZmND");
        setIntField(term60108, term60108.getClass(), "lastAllNetId", 1756090789);
        setField(term60108, term60108.getClass(), "lastClientId", "WVPSokrFPV");
        setIntField(term60108, term60108.getClass(), "lastUsedDeckId", -315044098);
        setIntField(term60108, term60108.getClass(), "lastPlayMusicLevel", 2920253);
        setIntField(term60108, term60108.getClass(), "lastEmoneyBrand", 310113293);
        term60371 = new Integer(-1668505285);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.ongeki.model.userdata.UserData");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = int.class;
        Object[] args = new Object[1];
        args[0] = term60371;
        callMethod(klass, "setPlayedTutorialBit", argTypes, term60108, args);
    }

};


