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

public class UserKop_getAuthKey_8330051523 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term272113;

    public UserKop_getAuthKey_8330051523() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Long term272119 = new Long(1528628920302068646L);
        term272113 = newInstance(Class.forName("icu.samnyan.aqua.sega.ongeki.model.userdata.UserKop"));
        Object term272115 = newInstance(Class.forName("icu.samnyan.aqua.sega.ongeki.model.userdata.UserData"));
        Object term272117 = newInstance(Class.forName("icu.samnyan.aqua.sega.general.model.Card"));
        Object term272133 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term272134 = newInstance(Class.forName("java.time.LocalDate"));
        Object term272138 = newInstance(Class.forName("java.time.LocalTime"));
        Object term272143 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term272144 = newInstance(Class.forName("java.time.LocalDate"));
        Object term272148 = newInstance(Class.forName("java.time.LocalTime"));
        setLongField(term272113, term272113.getClass(), "id", 2265130602305191901L);
        setLongField(term272115, term272115.getClass(), "id", -1303769865692243260L);
        setLongField(term272117, term272117.getClass(), "id", 7078912319065901390L);
        setField(term272117, term272117.getClass(), "extId", term272119);
        setField(term272117, term272117.getClass(), "luid", "nrxEBlDDtw");
        setIntField(term272134, term272134.getClass(), "year", 2018);
        setShortField(term272134, term272134.getClass(), "month", (short) 5);
        setShortField(term272134, term272134.getClass(), "day", (short) 10);
        setField(term272133, term272133.getClass(), "date", term272134);
        setByteField(term272138, term272138.getClass(), "hour", (byte) 4);
        setByteField(term272138, term272138.getClass(), "minute", (byte) 24);
        setByteField(term272138, term272138.getClass(), "second", (byte) 13);
        setIntField(term272138, term272138.getClass(), "nano", 683622181);
        setField(term272133, term272133.getClass(), "time", term272138);
        setField(term272117, term272117.getClass(), "registerTime", term272133);
        setIntField(term272144, term272144.getClass(), "year", 2020);
        setShortField(term272144, term272144.getClass(), "month", (short) 3);
        setShortField(term272144, term272144.getClass(), "day", (short) 27);
        setField(term272143, term272143.getClass(), "date", term272144);
        setByteField(term272148, term272148.getClass(), "hour", (byte) 13);
        setByteField(term272148, term272148.getClass(), "minute", (byte) 32);
        setByteField(term272148, term272148.getClass(), "second", (byte) 57);
        setIntField(term272148, term272148.getClass(), "nano", 463263039);
        setField(term272143, term272143.getClass(), "time", term272148);
        setField(term272117, term272117.getClass(), "accessTime", term272143);
        setField(term272115, term272115.getClass(), "card", term272117);
        setField(term272115, term272115.getClass(), "userName", "ZKcDOgjedL");
        setIntField(term272115, term272115.getClass(), "level", -256116824);
        setIntField(term272115, term272115.getClass(), "reincarnationNum", -124548665);
        setLongField(term272115, term272115.getClass(), "exp", 2769055639048156740L);
        setLongField(term272115, term272115.getClass(), "point", 7383065117376920433L);
        setLongField(term272115, term272115.getClass(), "totalPoint", 1265785580498916307L);
        setIntField(term272115, term272115.getClass(), "playCount", 1655508317);
        setIntField(term272115, term272115.getClass(), "jewelCount", -74173370);
        setIntField(term272115, term272115.getClass(), "totalJewelCount", -1760304154);
        setIntField(term272115, term272115.getClass(), "medalCount", 107685809);
        setIntField(term272115, term272115.getClass(), "playerRating", 1946075579);
        setIntField(term272115, term272115.getClass(), "highestRating", -1111915638);
        setIntField(term272115, term272115.getClass(), "battlePoint", 663576021);
        setIntField(term272115, term272115.getClass(), "bestBattlePoint", -1254576977);
        setIntField(term272115, term272115.getClass(), "overDamageBattlePoint", -1258344496);
        setBooleanField(term272115, term272115.getClass(), "isDialogWatchedSuggestMemory", false);
        setIntField(term272115, term272115.getClass(), "nameplateId", -1827033542);
        setIntField(term272115, term272115.getClass(), "trophyId", -1247831869);
        setIntField(term272115, term272115.getClass(), "cardId", 1449688423);
        setIntField(term272115, term272115.getClass(), "characterId", -1845034925);
        setIntField(term272115, term272115.getClass(), "characterVoiceNo", 994445695);
        setIntField(term272115, term272115.getClass(), "tabSetting", -492928823);
        setIntField(term272115, term272115.getClass(), "tabSortSetting", 1368633048);
        setIntField(term272115, term272115.getClass(), "cardCategorySetting", -1444516296);
        setIntField(term272115, term272115.getClass(), "cardSortSetting", 308255845);
        setIntField(term272115, term272115.getClass(), "rivalScoreCategorySetting", -988334088);
        setIntField(term272115, term272115.getClass(), "playedTutorialBit", 1129188729);
        setIntField(term272115, term272115.getClass(), "firstTutorialCancelNum", -751261444);
        setLongField(term272115, term272115.getClass(), "sumTechHighScore", 4857699315407075467L);
        setLongField(term272115, term272115.getClass(), "sumTechBasicHighScore", 5530335774057784394L);
        setLongField(term272115, term272115.getClass(), "sumTechAdvancedHighScore", 7292303710366467346L);
        setLongField(term272115, term272115.getClass(), "sumTechExpertHighScore", 7529112529119390322L);
        setLongField(term272115, term272115.getClass(), "sumTechMasterHighScore", -2238983078615920969L);
        setLongField(term272115, term272115.getClass(), "sumTechLunaticHighScore", -1100708545491237980L);
        setLongField(term272115, term272115.getClass(), "sumBattleHighScore", -5796854229815550042L);
        setLongField(term272115, term272115.getClass(), "sumBattleBasicHighScore", 4926554705495381679L);
        setLongField(term272115, term272115.getClass(), "sumBattleAdvancedHighScore", 8961294713333301772L);
        setLongField(term272115, term272115.getClass(), "sumBattleExpertHighScore", -4132062030988489475L);
        setLongField(term272115, term272115.getClass(), "sumBattleMasterHighScore", -5069322431711651879L);
        setLongField(term272115, term272115.getClass(), "sumBattleLunaticHighScore", -4583697686009431560L);
        setField(term272115, term272115.getClass(), "eventWatchedDate", "fbIyjOnFlU");
        setField(term272115, term272115.getClass(), "cmEventWatchedDate", "mHJnsoOUVm");
        setField(term272115, term272115.getClass(), "firstGameId", "SZTwFHuOlF");
        setField(term272115, term272115.getClass(), "firstRomVersion", "HuNcrtnuIr");
        setField(term272115, term272115.getClass(), "firstDataVersion", "UOgVwpVTwb");
        setField(term272115, term272115.getClass(), "firstPlayDate", "SNxxiwGooS");
        setField(term272115, term272115.getClass(), "lastGameId", "uACfzGuzLf");
        setField(term272115, term272115.getClass(), "lastRomVersion", "GhNtnTcGqj");
        setField(term272115, term272115.getClass(), "lastDataVersion", "llQSWhVMIU");
        setField(term272115, term272115.getClass(), "compatibleCmVersion", "obVHSLzFkr");
        setField(term272115, term272115.getClass(), "lastPlayDate", "qPqtpUGEBt");
        setIntField(term272115, term272115.getClass(), "lastPlaceId", -1117817445);
        setField(term272115, term272115.getClass(), "lastPlaceName", "LjpmgLxxAN");
        setIntField(term272115, term272115.getClass(), "lastRegionId", 1230680785);
        setField(term272115, term272115.getClass(), "lastRegionName", "axbOsAnkgV");
        setIntField(term272115, term272115.getClass(), "lastAllNetId", 1940583073);
        setField(term272115, term272115.getClass(), "lastClientId", "mNmYtNfYWV");
        setIntField(term272115, term272115.getClass(), "lastUsedDeckId", 1524271170);
        setIntField(term272115, term272115.getClass(), "lastPlayMusicLevel", 1281890678);
        setIntField(term272115, term272115.getClass(), "lastEmoneyBrand", -625924102);
        setField(term272113, term272113.getClass(), "user", term272115);
        setField(term272113, term272113.getClass(), "authKey", "yIaDArVQip");
        setIntField(term272113, term272113.getClass(), "kopId", 695176233);
        setIntField(term272113, term272113.getClass(), "areaId", -538942305);
        setIntField(term272113, term272113.getClass(), "totalTechScore", 2125548603);
        setIntField(term272113, term272113.getClass(), "totalPlatinumScore", -1792522449);
        setField(term272113, term272113.getClass(), "techRecordDate", "QoFWtaCVyb");
        setBooleanField(term272113, term272113.getClass(), "isTotalTechNewRecord", false);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.ongeki.model.userdata.UserKop");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getAuthKey", argTypes, term272113, args);
    }

};


