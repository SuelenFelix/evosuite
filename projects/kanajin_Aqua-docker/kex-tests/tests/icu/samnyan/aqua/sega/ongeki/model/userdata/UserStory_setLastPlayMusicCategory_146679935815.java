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

public class UserStory_setLastPlayMusicCategory_146679935815 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term164524;
     Object term164795;

    public UserStory_setLastPlayMusicCategory_146679935815() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Long term164530 = new Long(6150186973473930616L);
        term164524 = newInstance(Class.forName("icu.samnyan.aqua.sega.ongeki.model.userdata.UserStory"));
        Object term164526 = newInstance(Class.forName("icu.samnyan.aqua.sega.ongeki.model.userdata.UserData"));
        Object term164528 = newInstance(Class.forName("icu.samnyan.aqua.sega.general.model.Card"));
        Object term164544 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term164545 = newInstance(Class.forName("java.time.LocalDate"));
        Object term164549 = newInstance(Class.forName("java.time.LocalTime"));
        Object term164554 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term164555 = newInstance(Class.forName("java.time.LocalDate"));
        Object term164559 = newInstance(Class.forName("java.time.LocalTime"));
        setLongField(term164524, term164524.getClass(), "id", 5802374733902120404L);
        setLongField(term164526, term164526.getClass(), "id", -2160213762472734251L);
        setLongField(term164528, term164528.getClass(), "id", 2053196274651523185L);
        setField(term164528, term164528.getClass(), "extId", term164530);
        setField(term164528, term164528.getClass(), "luid", "IxKqBRlNhC");
        setIntField(term164545, term164545.getClass(), "year", 2029);
        setShortField(term164545, term164545.getClass(), "month", (short) 8);
        setShortField(term164545, term164545.getClass(), "day", (short) 22);
        setField(term164544, term164544.getClass(), "date", term164545);
        setByteField(term164549, term164549.getClass(), "hour", (byte) 10);
        setByteField(term164549, term164549.getClass(), "minute", (byte) 22);
        setByteField(term164549, term164549.getClass(), "second", (byte) 10);
        setIntField(term164549, term164549.getClass(), "nano", 996890551);
        setField(term164544, term164544.getClass(), "time", term164549);
        setField(term164528, term164528.getClass(), "registerTime", term164544);
        setIntField(term164555, term164555.getClass(), "year", 2021);
        setShortField(term164555, term164555.getClass(), "month", (short) 7);
        setShortField(term164555, term164555.getClass(), "day", (short) 26);
        setField(term164554, term164554.getClass(), "date", term164555);
        setByteField(term164559, term164559.getClass(), "hour", (byte) 16);
        setByteField(term164559, term164559.getClass(), "minute", (byte) 31);
        setByteField(term164559, term164559.getClass(), "second", (byte) 41);
        setIntField(term164559, term164559.getClass(), "nano", 114150112);
        setField(term164554, term164554.getClass(), "time", term164559);
        setField(term164528, term164528.getClass(), "accessTime", term164554);
        setField(term164526, term164526.getClass(), "card", term164528);
        setField(term164526, term164526.getClass(), "userName", "luSAqFzxeY");
        setIntField(term164526, term164526.getClass(), "level", -114111309);
        setIntField(term164526, term164526.getClass(), "reincarnationNum", -2138943082);
        setLongField(term164526, term164526.getClass(), "exp", -8624949217735869992L);
        setLongField(term164526, term164526.getClass(), "point", 2930009653397034975L);
        setLongField(term164526, term164526.getClass(), "totalPoint", 7962633237038441170L);
        setIntField(term164526, term164526.getClass(), "playCount", -186268116);
        setIntField(term164526, term164526.getClass(), "jewelCount", -2082248803);
        setIntField(term164526, term164526.getClass(), "totalJewelCount", -1705126082);
        setIntField(term164526, term164526.getClass(), "medalCount", -720862130);
        setIntField(term164526, term164526.getClass(), "playerRating", 1070677067);
        setIntField(term164526, term164526.getClass(), "highestRating", -2011581334);
        setIntField(term164526, term164526.getClass(), "battlePoint", 1700393240);
        setIntField(term164526, term164526.getClass(), "bestBattlePoint", -2014947462);
        setIntField(term164526, term164526.getClass(), "overDamageBattlePoint", -719658316);
        setBooleanField(term164526, term164526.getClass(), "isDialogWatchedSuggestMemory", false);
        setIntField(term164526, term164526.getClass(), "nameplateId", 303187441);
        setIntField(term164526, term164526.getClass(), "trophyId", -1129294722);
        setIntField(term164526, term164526.getClass(), "cardId", -1465687477);
        setIntField(term164526, term164526.getClass(), "characterId", 1456965553);
        setIntField(term164526, term164526.getClass(), "characterVoiceNo", 891917447);
        setIntField(term164526, term164526.getClass(), "tabSetting", 733611816);
        setIntField(term164526, term164526.getClass(), "tabSortSetting", 809743488);
        setIntField(term164526, term164526.getClass(), "cardCategorySetting", -2061421262);
        setIntField(term164526, term164526.getClass(), "cardSortSetting", 729222890);
        setIntField(term164526, term164526.getClass(), "rivalScoreCategorySetting", -1662914642);
        setIntField(term164526, term164526.getClass(), "playedTutorialBit", -355284486);
        setIntField(term164526, term164526.getClass(), "firstTutorialCancelNum", 1770512077);
        setLongField(term164526, term164526.getClass(), "sumTechHighScore", -4251882276629548538L);
        setLongField(term164526, term164526.getClass(), "sumTechBasicHighScore", -2512489315719996447L);
        setLongField(term164526, term164526.getClass(), "sumTechAdvancedHighScore", 4970736928905252160L);
        setLongField(term164526, term164526.getClass(), "sumTechExpertHighScore", -1554841210244602287L);
        setLongField(term164526, term164526.getClass(), "sumTechMasterHighScore", 2486531374354637666L);
        setLongField(term164526, term164526.getClass(), "sumTechLunaticHighScore", 1067985593376883262L);
        setLongField(term164526, term164526.getClass(), "sumBattleHighScore", -5499913086956312323L);
        setLongField(term164526, term164526.getClass(), "sumBattleBasicHighScore", -847032915869884035L);
        setLongField(term164526, term164526.getClass(), "sumBattleAdvancedHighScore", 4566362170283660512L);
        setLongField(term164526, term164526.getClass(), "sumBattleExpertHighScore", -6157498252500278084L);
        setLongField(term164526, term164526.getClass(), "sumBattleMasterHighScore", -500597048395850783L);
        setLongField(term164526, term164526.getClass(), "sumBattleLunaticHighScore", -2280328110275213593L);
        setField(term164526, term164526.getClass(), "eventWatchedDate", "gHSquTdfrK");
        setField(term164526, term164526.getClass(), "cmEventWatchedDate", "lwSNhfQGzI");
        setField(term164526, term164526.getClass(), "firstGameId", "MvvzPTyVSb");
        setField(term164526, term164526.getClass(), "firstRomVersion", "aLyUXyVGbN");
        setField(term164526, term164526.getClass(), "firstDataVersion", "OHqCZWvTjl");
        setField(term164526, term164526.getClass(), "firstPlayDate", "UqemyfWxle");
        setField(term164526, term164526.getClass(), "lastGameId", "nhoRGmIXDW");
        setField(term164526, term164526.getClass(), "lastRomVersion", "jlNEkpWcyV");
        setField(term164526, term164526.getClass(), "lastDataVersion", "FKSbPLBPmr");
        setField(term164526, term164526.getClass(), "compatibleCmVersion", "LCslPgYXVZ");
        setField(term164526, term164526.getClass(), "lastPlayDate", "qOrFOOrfRo");
        setIntField(term164526, term164526.getClass(), "lastPlaceId", -187774462);
        setField(term164526, term164526.getClass(), "lastPlaceName", "QubZHCpfda");
        setIntField(term164526, term164526.getClass(), "lastRegionId", -1557635802);
        setField(term164526, term164526.getClass(), "lastRegionName", "OKkmdNRQTI");
        setIntField(term164526, term164526.getClass(), "lastAllNetId", 863085455);
        setField(term164526, term164526.getClass(), "lastClientId", "mMCbEcTRXT");
        setIntField(term164526, term164526.getClass(), "lastUsedDeckId", -825201659);
        setIntField(term164526, term164526.getClass(), "lastPlayMusicLevel", 1694627785);
        setIntField(term164526, term164526.getClass(), "lastEmoneyBrand", -1218124526);
        setField(term164524, term164524.getClass(), "user", term164526);
        setIntField(term164524, term164524.getClass(), "storyId", 2095913246);
        setIntField(term164524, term164524.getClass(), "lastChapterId", 2032378574);
        setIntField(term164524, term164524.getClass(), "jewelCount", -532981370);
        setIntField(term164524, term164524.getClass(), "lastPlayMusicId", -634537095);
        setIntField(term164524, term164524.getClass(), "lastPlayMusicCategory", -1818314526);
        setIntField(term164524, term164524.getClass(), "lastPlayMusicLevel", -186468784);
        term164795 = new Integer(-126607040);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.ongeki.model.userdata.UserStory");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = int.class;
        Object[] args = new Object[1];
        args[0] = term164795;
        callMethod(klass, "setLastPlayMusicCategory", argTypes, term164524, args);
    }

};


