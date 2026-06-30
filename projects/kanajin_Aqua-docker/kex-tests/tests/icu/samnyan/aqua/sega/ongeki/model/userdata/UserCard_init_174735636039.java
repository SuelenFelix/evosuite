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

public class UserCard_init_174735636039 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term132694;
     Object term132696;
     Object term132959;
     Object term132961;
     Object term132963;
     Object term132965;
     Object term132967;
     Object term132969;
     Object term132971;
     Object term132973;
     Object term132975;
     Object term133001;
     Object term133003;

    public UserCard_init_174735636039() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term132694 = new Long(-4235417689645195078L);
        Long term132700 = new Long(6041374912351843923L);
        term132696 = newInstance(Class.forName("icu.samnyan.aqua.sega.ongeki.model.userdata.UserData"));
        Object term132698 = newInstance(Class.forName("icu.samnyan.aqua.sega.general.model.Card"));
        Object term132714 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term132715 = newInstance(Class.forName("java.time.LocalDate"));
        Object term132719 = newInstance(Class.forName("java.time.LocalTime"));
        Object term132724 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term132725 = newInstance(Class.forName("java.time.LocalDate"));
        Object term132729 = newInstance(Class.forName("java.time.LocalTime"));
        setLongField(term132696, term132696.getClass(), "id", -7091616608085105706L);
        setLongField(term132698, term132698.getClass(), "id", -3760947611880902043L);
        setField(term132698, term132698.getClass(), "extId", term132700);
        setField(term132698, term132698.getClass(), "luid", "nuzwgdczLX");
        setIntField(term132715, term132715.getClass(), "year", 2025);
        setShortField(term132715, term132715.getClass(), "month", (short) 7);
        setShortField(term132715, term132715.getClass(), "day", (short) 31);
        setField(term132714, term132714.getClass(), "date", term132715);
        setByteField(term132719, term132719.getClass(), "hour", (byte) 14);
        setByteField(term132719, term132719.getClass(), "minute", (byte) 45);
        setByteField(term132719, term132719.getClass(), "second", (byte) 16);
        setIntField(term132719, term132719.getClass(), "nano", 864162960);
        setField(term132714, term132714.getClass(), "time", term132719);
        setField(term132698, term132698.getClass(), "registerTime", term132714);
        setIntField(term132725, term132725.getClass(), "year", 2018);
        setShortField(term132725, term132725.getClass(), "month", (short) 11);
        setShortField(term132725, term132725.getClass(), "day", (short) 5);
        setField(term132724, term132724.getClass(), "date", term132725);
        setByteField(term132729, term132729.getClass(), "hour", (byte) 11);
        setByteField(term132729, term132729.getClass(), "minute", (byte) 27);
        setByteField(term132729, term132729.getClass(), "second", (byte) 20);
        setIntField(term132729, term132729.getClass(), "nano", 980926676);
        setField(term132724, term132724.getClass(), "time", term132729);
        setField(term132698, term132698.getClass(), "accessTime", term132724);
        setField(term132696, term132696.getClass(), "card", term132698);
        setField(term132696, term132696.getClass(), "userName", "FdFPAsGWZj");
        setIntField(term132696, term132696.getClass(), "level", -1571407716);
        setIntField(term132696, term132696.getClass(), "reincarnationNum", -1634609318);
        setLongField(term132696, term132696.getClass(), "exp", -1701792840204217751L);
        setLongField(term132696, term132696.getClass(), "point", 1560915075537055203L);
        setLongField(term132696, term132696.getClass(), "totalPoint", -90573974712418969L);
        setIntField(term132696, term132696.getClass(), "playCount", 911431447);
        setIntField(term132696, term132696.getClass(), "jewelCount", -1798345464);
        setIntField(term132696, term132696.getClass(), "totalJewelCount", 991660062);
        setIntField(term132696, term132696.getClass(), "medalCount", 1387364689);
        setIntField(term132696, term132696.getClass(), "playerRating", -180600496);
        setIntField(term132696, term132696.getClass(), "highestRating", -1916507105);
        setIntField(term132696, term132696.getClass(), "battlePoint", -269773023);
        setIntField(term132696, term132696.getClass(), "bestBattlePoint", -718649828);
        setIntField(term132696, term132696.getClass(), "overDamageBattlePoint", -324751303);
        setBooleanField(term132696, term132696.getClass(), "isDialogWatchedSuggestMemory", false);
        setIntField(term132696, term132696.getClass(), "nameplateId", 59394991);
        setIntField(term132696, term132696.getClass(), "trophyId", 1340125056);
        setIntField(term132696, term132696.getClass(), "cardId", -163957346);
        setIntField(term132696, term132696.getClass(), "characterId", 536808724);
        setIntField(term132696, term132696.getClass(), "characterVoiceNo", -534385154);
        setIntField(term132696, term132696.getClass(), "tabSetting", -1277688883);
        setIntField(term132696, term132696.getClass(), "tabSortSetting", 2143702118);
        setIntField(term132696, term132696.getClass(), "cardCategorySetting", -1514256392);
        setIntField(term132696, term132696.getClass(), "cardSortSetting", -706084233);
        setIntField(term132696, term132696.getClass(), "rivalScoreCategorySetting", 786595172);
        setIntField(term132696, term132696.getClass(), "playedTutorialBit", 1090005556);
        setIntField(term132696, term132696.getClass(), "firstTutorialCancelNum", 86451720);
        setLongField(term132696, term132696.getClass(), "sumTechHighScore", 6947995689916804630L);
        setLongField(term132696, term132696.getClass(), "sumTechBasicHighScore", -6905690411244224598L);
        setLongField(term132696, term132696.getClass(), "sumTechAdvancedHighScore", 4681112233462188924L);
        setLongField(term132696, term132696.getClass(), "sumTechExpertHighScore", 3742801813763658661L);
        setLongField(term132696, term132696.getClass(), "sumTechMasterHighScore", 1046627136894251443L);
        setLongField(term132696, term132696.getClass(), "sumTechLunaticHighScore", -1069316504413319548L);
        setLongField(term132696, term132696.getClass(), "sumBattleHighScore", 4514223761576413504L);
        setLongField(term132696, term132696.getClass(), "sumBattleBasicHighScore", 6447605008647498129L);
        setLongField(term132696, term132696.getClass(), "sumBattleAdvancedHighScore", 6184695257795475851L);
        setLongField(term132696, term132696.getClass(), "sumBattleExpertHighScore", 7760583351043816921L);
        setLongField(term132696, term132696.getClass(), "sumBattleMasterHighScore", 5506057899098048301L);
        setLongField(term132696, term132696.getClass(), "sumBattleLunaticHighScore", -5199834194811775473L);
        setField(term132696, term132696.getClass(), "eventWatchedDate", "sqctDxfcQV");
        setField(term132696, term132696.getClass(), "cmEventWatchedDate", "KHXlwfHOLE");
        setField(term132696, term132696.getClass(), "firstGameId", "oxoYdAYVkI");
        setField(term132696, term132696.getClass(), "firstRomVersion", "jUYVgbuaNi");
        setField(term132696, term132696.getClass(), "firstDataVersion", "IVqaVowLVl");
        setField(term132696, term132696.getClass(), "firstPlayDate", "wsWWrTxdcC");
        setField(term132696, term132696.getClass(), "lastGameId", "UPDwVukZbZ");
        setField(term132696, term132696.getClass(), "lastRomVersion", "nFQQbKAYNp");
        setField(term132696, term132696.getClass(), "lastDataVersion", "VQkWATPAEW");
        setField(term132696, term132696.getClass(), "compatibleCmVersion", "giGfkdhPAE");
        setField(term132696, term132696.getClass(), "lastPlayDate", "wNfBmUuDuP");
        setIntField(term132696, term132696.getClass(), "lastPlaceId", -1916270131);
        setField(term132696, term132696.getClass(), "lastPlaceName", "lNTNKavUNL");
        setIntField(term132696, term132696.getClass(), "lastRegionId", 430692285);
        setField(term132696, term132696.getClass(), "lastRegionName", "BXfmFjgpOy");
        setIntField(term132696, term132696.getClass(), "lastAllNetId", 354561212);
        setField(term132696, term132696.getClass(), "lastClientId", "JCeHaSFOWK");
        setIntField(term132696, term132696.getClass(), "lastUsedDeckId", -1171538201);
        setIntField(term132696, term132696.getClass(), "lastPlayMusicLevel", 1030420582);
        setIntField(term132696, term132696.getClass(), "lastEmoneyBrand", 1441242370);
        term132959 = new Integer(-1266421079);
        term132961 = new Integer(-428024469);
        term132963 = new Integer(-428926218);
        term132965 = new Integer(1874384865);
        term132967 = new Integer(-559576348);
        term132969 = new Integer(-779864176);
        term132971 = new Integer(-819912343);
        term132973 = new Integer(1828884130);
        term132975 = new Boolean(true);
        term133001 = new Integer(-1130376171);
        term133003 = new Boolean(true);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.ongeki.model.userdata.UserCard");
        Class<?>[] argTypes = new Class<?>[16];
        argTypes[0] = long.class;
        argTypes[1] = Class.forName("icu.samnyan.aqua.sega.ongeki.model.userdata.UserData");
        argTypes[2] = int.class;
        argTypes[3] = int.class;
        argTypes[4] = int.class;
        argTypes[5] = int.class;
        argTypes[6] = int.class;
        argTypes[7] = int.class;
        argTypes[8] = int.class;
        argTypes[9] = int.class;
        argTypes[10] = boolean.class;
        argTypes[11] = Class.forName("java.lang.String");
        argTypes[12] = Class.forName("java.lang.String");
        argTypes[13] = int.class;
        argTypes[14] = boolean.class;
        argTypes[15] = Class.forName("java.lang.String");
        Object[] args = new Object[16];
        args[0] = term132694;
        args[1] = term132696;
        args[2] = term132959;
        args[3] = term132961;
        args[4] = term132963;
        args[5] = term132965;
        args[6] = term132967;
        args[7] = term132969;
        args[8] = term132971;
        args[9] = term132973;
        args[10] = term132975;
        args[11] = "PNtiQWTZzA";
        args[12] = "raishRurKx";
        args[13] = term133001;
        args[14] = term133003;
        args[15] = "PpeSAmBPlT";
        Object instance = callConstructor(klass, argTypes, args);
    }

};


