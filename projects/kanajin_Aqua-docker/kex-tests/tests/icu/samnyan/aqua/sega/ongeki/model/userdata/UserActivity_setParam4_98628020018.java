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

public class UserActivity_setParam4_98628020018 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term290935;
     Object term291207;

    public UserActivity_setParam4_98628020018() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Long term290941 = new Long(-159468133651974975L);
        term290935 = newInstance(Class.forName("icu.samnyan.aqua.sega.ongeki.model.userdata.UserActivity"));
        Object term290937 = newInstance(Class.forName("icu.samnyan.aqua.sega.ongeki.model.userdata.UserData"));
        Object term290939 = newInstance(Class.forName("icu.samnyan.aqua.sega.general.model.Card"));
        Object term290955 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term290956 = newInstance(Class.forName("java.time.LocalDate"));
        Object term290960 = newInstance(Class.forName("java.time.LocalTime"));
        Object term290965 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term290966 = newInstance(Class.forName("java.time.LocalDate"));
        Object term290970 = newInstance(Class.forName("java.time.LocalTime"));
        setLongField(term290935, term290935.getClass(), "id", -9180632422283497113L);
        setLongField(term290937, term290937.getClass(), "id", 1650168200859916971L);
        setLongField(term290939, term290939.getClass(), "id", 4401511761976649733L);
        setField(term290939, term290939.getClass(), "extId", term290941);
        setField(term290939, term290939.getClass(), "luid", "iVMKgSDqtv");
        setIntField(term290956, term290956.getClass(), "year", 2017);
        setShortField(term290956, term290956.getClass(), "month", (short) 7);
        setShortField(term290956, term290956.getClass(), "day", (short) 16);
        setField(term290955, term290955.getClass(), "date", term290956);
        setByteField(term290960, term290960.getClass(), "hour", (byte) 0);
        setByteField(term290960, term290960.getClass(), "minute", (byte) 16);
        setByteField(term290960, term290960.getClass(), "second", (byte) 38);
        setIntField(term290960, term290960.getClass(), "nano", 78836118);
        setField(term290955, term290955.getClass(), "time", term290960);
        setField(term290939, term290939.getClass(), "registerTime", term290955);
        setIntField(term290966, term290966.getClass(), "year", 2012);
        setShortField(term290966, term290966.getClass(), "month", (short) 4);
        setShortField(term290966, term290966.getClass(), "day", (short) 21);
        setField(term290965, term290965.getClass(), "date", term290966);
        setByteField(term290970, term290970.getClass(), "hour", (byte) 14);
        setByteField(term290970, term290970.getClass(), "minute", (byte) 9);
        setByteField(term290970, term290970.getClass(), "second", (byte) 51);
        setIntField(term290970, term290970.getClass(), "nano", 383840768);
        setField(term290965, term290965.getClass(), "time", term290970);
        setField(term290939, term290939.getClass(), "accessTime", term290965);
        setField(term290937, term290937.getClass(), "card", term290939);
        setField(term290937, term290937.getClass(), "userName", "snUMTDsDAQ");
        setIntField(term290937, term290937.getClass(), "level", -143449377);
        setIntField(term290937, term290937.getClass(), "reincarnationNum", -89151464);
        setLongField(term290937, term290937.getClass(), "exp", -3243350870865143487L);
        setLongField(term290937, term290937.getClass(), "point", -2911100857515438344L);
        setLongField(term290937, term290937.getClass(), "totalPoint", 3643251485285668583L);
        setIntField(term290937, term290937.getClass(), "playCount", -1373149444);
        setIntField(term290937, term290937.getClass(), "jewelCount", -828112463);
        setIntField(term290937, term290937.getClass(), "totalJewelCount", -769908256);
        setIntField(term290937, term290937.getClass(), "medalCount", 1342183652);
        setIntField(term290937, term290937.getClass(), "playerRating", -201759904);
        setIntField(term290937, term290937.getClass(), "highestRating", -1171331006);
        setIntField(term290937, term290937.getClass(), "battlePoint", 2147333912);
        setIntField(term290937, term290937.getClass(), "bestBattlePoint", -677194022);
        setIntField(term290937, term290937.getClass(), "overDamageBattlePoint", 2097521115);
        setBooleanField(term290937, term290937.getClass(), "isDialogWatchedSuggestMemory", false);
        setIntField(term290937, term290937.getClass(), "nameplateId", 1336945294);
        setIntField(term290937, term290937.getClass(), "trophyId", 2060487362);
        setIntField(term290937, term290937.getClass(), "cardId", -1694934458);
        setIntField(term290937, term290937.getClass(), "characterId", 92989858);
        setIntField(term290937, term290937.getClass(), "characterVoiceNo", -2117162462);
        setIntField(term290937, term290937.getClass(), "tabSetting", -2124947990);
        setIntField(term290937, term290937.getClass(), "tabSortSetting", 614149136);
        setIntField(term290937, term290937.getClass(), "cardCategorySetting", 1955650621);
        setIntField(term290937, term290937.getClass(), "cardSortSetting", -1524889218);
        setIntField(term290937, term290937.getClass(), "rivalScoreCategorySetting", 527941185);
        setIntField(term290937, term290937.getClass(), "playedTutorialBit", 63598329);
        setIntField(term290937, term290937.getClass(), "firstTutorialCancelNum", 176783226);
        setLongField(term290937, term290937.getClass(), "sumTechHighScore", 7751146908622478773L);
        setLongField(term290937, term290937.getClass(), "sumTechBasicHighScore", -8565143331110967788L);
        setLongField(term290937, term290937.getClass(), "sumTechAdvancedHighScore", -4439745964833821856L);
        setLongField(term290937, term290937.getClass(), "sumTechExpertHighScore", 3024475308594505265L);
        setLongField(term290937, term290937.getClass(), "sumTechMasterHighScore", -8079584904190946449L);
        setLongField(term290937, term290937.getClass(), "sumTechLunaticHighScore", -8785877890937408791L);
        setLongField(term290937, term290937.getClass(), "sumBattleHighScore", 8790485621346943117L);
        setLongField(term290937, term290937.getClass(), "sumBattleBasicHighScore", 1282928381405135779L);
        setLongField(term290937, term290937.getClass(), "sumBattleAdvancedHighScore", -1512048456921546304L);
        setLongField(term290937, term290937.getClass(), "sumBattleExpertHighScore", -1571558244072603828L);
        setLongField(term290937, term290937.getClass(), "sumBattleMasterHighScore", -5367680772048679475L);
        setLongField(term290937, term290937.getClass(), "sumBattleLunaticHighScore", 7324463420874000473L);
        setField(term290937, term290937.getClass(), "eventWatchedDate", "mLLEZxImzO");
        setField(term290937, term290937.getClass(), "cmEventWatchedDate", "pmCySZHNoC");
        setField(term290937, term290937.getClass(), "firstGameId", "WvaVoeUTqA");
        setField(term290937, term290937.getClass(), "firstRomVersion", "dkswgBXyfe");
        setField(term290937, term290937.getClass(), "firstDataVersion", "YHtTpcXHtC");
        setField(term290937, term290937.getClass(), "firstPlayDate", "uqzybgAbHn");
        setField(term290937, term290937.getClass(), "lastGameId", "bVWOnKMYwA");
        setField(term290937, term290937.getClass(), "lastRomVersion", "IQqGtjQIFE");
        setField(term290937, term290937.getClass(), "lastDataVersion", "RmkFdgzLOk");
        setField(term290937, term290937.getClass(), "compatibleCmVersion", "MbeNzUVsCl");
        setField(term290937, term290937.getClass(), "lastPlayDate", "JrFwmRIxXJ");
        setIntField(term290937, term290937.getClass(), "lastPlaceId", 834511096);
        setField(term290937, term290937.getClass(), "lastPlaceName", "CBPHkMUpDJ");
        setIntField(term290937, term290937.getClass(), "lastRegionId", 1767514928);
        setField(term290937, term290937.getClass(), "lastRegionName", "kcrVudpPVv");
        setIntField(term290937, term290937.getClass(), "lastAllNetId", -103728860);
        setField(term290937, term290937.getClass(), "lastClientId", "fHMfHuQbLa");
        setIntField(term290937, term290937.getClass(), "lastUsedDeckId", -1909656924);
        setIntField(term290937, term290937.getClass(), "lastPlayMusicLevel", 1706384864);
        setIntField(term290937, term290937.getClass(), "lastEmoneyBrand", 2048935983);
        setField(term290935, term290935.getClass(), "user", term290937);
        setIntField(term290935, term290935.getClass(), "kind", 1612480984);
        setIntField(term290935, term290935.getClass(), "activityId", 540984053);
        setIntField(term290935, term290935.getClass(), "sortNumber", 750186468);
        setIntField(term290935, term290935.getClass(), "param1", 1084151894);
        setIntField(term290935, term290935.getClass(), "param2", -403593340);
        setIntField(term290935, term290935.getClass(), "param3", -168848568);
        setIntField(term290935, term290935.getClass(), "param4", -363337546);
        term291207 = new Integer(897105715);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.ongeki.model.userdata.UserActivity");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = int.class;
        Object[] args = new Object[1];
        args[0] = term291207;
        callMethod(klass, "setParam4", argTypes, term290935, args);
    }

};


