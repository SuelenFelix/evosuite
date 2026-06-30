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
import java.lang.Long;
import java.lang.Object;
import java.lang.Integer;
import java.lang.Boolean;

public class UserEventMusic_init_74833392726 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term380837;
     Object term380839;
     Object term381102;
     Object term381104;
     Object term381106;
     Object term381108;
     Object term381110;
     Object term381112;
     Object term381126;

    public UserEventMusic_init_74833392726() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term380837 = new Long(-7712760164821910996L);
        Long term380843 = new Long(-836309941570511418L);
        term380839 = newInstance(Class.forName("icu.samnyan.aqua.sega.ongeki.model.userdata.UserData"));
        Object term380841 = newInstance(Class.forName("icu.samnyan.aqua.sega.general.model.Card"));
        Object term380857 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term380858 = newInstance(Class.forName("java.time.LocalDate"));
        Object term380862 = newInstance(Class.forName("java.time.LocalTime"));
        Object term380867 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term380868 = newInstance(Class.forName("java.time.LocalDate"));
        Object term380872 = newInstance(Class.forName("java.time.LocalTime"));
        setLongField(term380839, term380839.getClass(), "id", 9106673529462459447L);
        setLongField(term380841, term380841.getClass(), "id", 6311827799147922343L);
        setField(term380841, term380841.getClass(), "extId", term380843);
        setField(term380841, term380841.getClass(), "luid", "ySejCRlcyX");
        setIntField(term380858, term380858.getClass(), "year", 2029);
        setShortField(term380858, term380858.getClass(), "month", (short) 1);
        setShortField(term380858, term380858.getClass(), "day", (short) 25);
        setField(term380857, term380857.getClass(), "date", term380858);
        setByteField(term380862, term380862.getClass(), "hour", (byte) 13);
        setByteField(term380862, term380862.getClass(), "minute", (byte) 37);
        setByteField(term380862, term380862.getClass(), "second", (byte) 9);
        setIntField(term380862, term380862.getClass(), "nano", 105283883);
        setField(term380857, term380857.getClass(), "time", term380862);
        setField(term380841, term380841.getClass(), "registerTime", term380857);
        setIntField(term380868, term380868.getClass(), "year", 2025);
        setShortField(term380868, term380868.getClass(), "month", (short) 4);
        setShortField(term380868, term380868.getClass(), "day", (short) 17);
        setField(term380867, term380867.getClass(), "date", term380868);
        setByteField(term380872, term380872.getClass(), "hour", (byte) 5);
        setByteField(term380872, term380872.getClass(), "minute", (byte) 18);
        setByteField(term380872, term380872.getClass(), "second", (byte) 1);
        setIntField(term380872, term380872.getClass(), "nano", 251091894);
        setField(term380867, term380867.getClass(), "time", term380872);
        setField(term380841, term380841.getClass(), "accessTime", term380867);
        setField(term380839, term380839.getClass(), "card", term380841);
        setField(term380839, term380839.getClass(), "userName", "yrQgyYtARK");
        setIntField(term380839, term380839.getClass(), "level", 134191074);
        setIntField(term380839, term380839.getClass(), "reincarnationNum", 1124741147);
        setLongField(term380839, term380839.getClass(), "exp", 8984625619197056648L);
        setLongField(term380839, term380839.getClass(), "point", 5111242335413209530L);
        setLongField(term380839, term380839.getClass(), "totalPoint", 6629768388834084282L);
        setIntField(term380839, term380839.getClass(), "playCount", -1336539531);
        setIntField(term380839, term380839.getClass(), "jewelCount", 937828417);
        setIntField(term380839, term380839.getClass(), "totalJewelCount", 718563752);
        setIntField(term380839, term380839.getClass(), "medalCount", -1967288577);
        setIntField(term380839, term380839.getClass(), "playerRating", -413045646);
        setIntField(term380839, term380839.getClass(), "highestRating", -878651706);
        setIntField(term380839, term380839.getClass(), "battlePoint", 1017154759);
        setIntField(term380839, term380839.getClass(), "bestBattlePoint", -2061671295);
        setIntField(term380839, term380839.getClass(), "overDamageBattlePoint", -634051849);
        setBooleanField(term380839, term380839.getClass(), "isDialogWatchedSuggestMemory", false);
        setIntField(term380839, term380839.getClass(), "nameplateId", -1583381217);
        setIntField(term380839, term380839.getClass(), "trophyId", 131481136);
        setIntField(term380839, term380839.getClass(), "cardId", 1106443887);
        setIntField(term380839, term380839.getClass(), "characterId", 1564281823);
        setIntField(term380839, term380839.getClass(), "characterVoiceNo", 45517191);
        setIntField(term380839, term380839.getClass(), "tabSetting", -1358747389);
        setIntField(term380839, term380839.getClass(), "tabSortSetting", -2070096628);
        setIntField(term380839, term380839.getClass(), "cardCategorySetting", 1844127670);
        setIntField(term380839, term380839.getClass(), "cardSortSetting", 766074892);
        setIntField(term380839, term380839.getClass(), "rivalScoreCategorySetting", -241004439);
        setIntField(term380839, term380839.getClass(), "playedTutorialBit", 1250873944);
        setIntField(term380839, term380839.getClass(), "firstTutorialCancelNum", 1645020594);
        setLongField(term380839, term380839.getClass(), "sumTechHighScore", 8376844301310969858L);
        setLongField(term380839, term380839.getClass(), "sumTechBasicHighScore", -1057303288557996580L);
        setLongField(term380839, term380839.getClass(), "sumTechAdvancedHighScore", 8346609381820179413L);
        setLongField(term380839, term380839.getClass(), "sumTechExpertHighScore", -2810426404365271745L);
        setLongField(term380839, term380839.getClass(), "sumTechMasterHighScore", 646283272492214623L);
        setLongField(term380839, term380839.getClass(), "sumTechLunaticHighScore", -2817222944789764041L);
        setLongField(term380839, term380839.getClass(), "sumBattleHighScore", 6156269281816672014L);
        setLongField(term380839, term380839.getClass(), "sumBattleBasicHighScore", 8617789617608568098L);
        setLongField(term380839, term380839.getClass(), "sumBattleAdvancedHighScore", -3643278560384451792L);
        setLongField(term380839, term380839.getClass(), "sumBattleExpertHighScore", 5475221484169977001L);
        setLongField(term380839, term380839.getClass(), "sumBattleMasterHighScore", 7814154217449744345L);
        setLongField(term380839, term380839.getClass(), "sumBattleLunaticHighScore", 5221870096141947461L);
        setField(term380839, term380839.getClass(), "eventWatchedDate", "nBqQIQrNNP");
        setField(term380839, term380839.getClass(), "cmEventWatchedDate", "REAAarvtis");
        setField(term380839, term380839.getClass(), "firstGameId", "GmczrRKnMd");
        setField(term380839, term380839.getClass(), "firstRomVersion", "afJLVVEgcx");
        setField(term380839, term380839.getClass(), "firstDataVersion", "PfhdJifaaa");
        setField(term380839, term380839.getClass(), "firstPlayDate", "nnGcdxIkDu");
        setField(term380839, term380839.getClass(), "lastGameId", "YqBQOkhvNr");
        setField(term380839, term380839.getClass(), "lastRomVersion", "lHhKcXpZFe");
        setField(term380839, term380839.getClass(), "lastDataVersion", "SgwEtyAPUG");
        setField(term380839, term380839.getClass(), "compatibleCmVersion", "VhdIzZaFbZ");
        setField(term380839, term380839.getClass(), "lastPlayDate", "JaLeTORjkB");
        setIntField(term380839, term380839.getClass(), "lastPlaceId", 235963762);
        setField(term380839, term380839.getClass(), "lastPlaceName", "xNssIUtLJE");
        setIntField(term380839, term380839.getClass(), "lastRegionId", 2013774496);
        setField(term380839, term380839.getClass(), "lastRegionName", "CRffvCBqah");
        setIntField(term380839, term380839.getClass(), "lastAllNetId", 804866451);
        setField(term380839, term380839.getClass(), "lastClientId", "nTWpoKevNk");
        setIntField(term380839, term380839.getClass(), "lastUsedDeckId", 1794359011);
        setIntField(term380839, term380839.getClass(), "lastPlayMusicLevel", -1409276841);
        setIntField(term380839, term380839.getClass(), "lastEmoneyBrand", -233559721);
        term381102 = new Integer(-76979452);
        term381104 = new Integer(2051272873);
        term381106 = new Integer(-292949865);
        term381108 = new Integer(-1949463749);
        term381110 = new Integer(220069878);
        term381112 = new Integer(-1717147033);
        term381126 = new Boolean(false);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.ongeki.model.userdata.UserEventMusic");
        Class<?>[] argTypes = new Class<?>[10];
        argTypes[0] = long.class;
        argTypes[1] = Class.forName("icu.samnyan.aqua.sega.ongeki.model.userdata.UserData");
        argTypes[2] = int.class;
        argTypes[3] = int.class;
        argTypes[4] = int.class;
        argTypes[5] = int.class;
        argTypes[6] = int.class;
        argTypes[7] = int.class;
        argTypes[8] = Class.forName("java.lang.String");
        argTypes[9] = boolean.class;
        Object[] args = new Object[10];
        args[0] = term380837;
        args[1] = term380839;
        args[2] = term381102;
        args[3] = term381104;
        args[4] = term381106;
        args[5] = term381108;
        args[6] = term381110;
        args[7] = term381112;
        args[8] = "iBGtHZIDxp";
        args[9] = term381126;
        Object instance = callConstructor(klass, argTypes, args);
    }

};


