package icu.samnyan.aqua.sega.chunithm.model.userdata;

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
import static icu.samnyan.aqua.sega.chunithm.model.userdata.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.lang.Object;
import java.lang.Long;
import java.lang.Integer;

public class UserGameOption_setBgInfo_197919735327 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term61299;
     Object term61599;

    public UserGameOption_setBgInfo_197919735327() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Long term61305 = new Long(7276637106827860087L);
        term61299 = newInstance(Class.forName("icu.samnyan.aqua.sega.chunithm.model.userdata.UserGameOption"));
        Object term61301 = newInstance(Class.forName("icu.samnyan.aqua.sega.chunithm.model.userdata.UserData"));
        Object term61303 = newInstance(Class.forName("icu.samnyan.aqua.sega.general.model.Card"));
        Object term61319 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term61320 = newInstance(Class.forName("java.time.LocalDate"));
        Object term61324 = newInstance(Class.forName("java.time.LocalTime"));
        Object term61329 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term61330 = newInstance(Class.forName("java.time.LocalDate"));
        Object term61334 = newInstance(Class.forName("java.time.LocalTime"));
        Object term61351 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term61352 = newInstance(Class.forName("java.time.LocalDate"));
        Object term61356 = newInstance(Class.forName("java.time.LocalTime"));
        Object term61412 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term61413 = newInstance(Class.forName("java.time.LocalDate"));
        Object term61417 = newInstance(Class.forName("java.time.LocalTime"));
        Object term61460 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term61461 = newInstance(Class.forName("java.time.LocalDate"));
        Object term61465 = newInstance(Class.forName("java.time.LocalTime"));
        Object term61506 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term61507 = newInstance(Class.forName("java.time.LocalDate"));
        Object term61511 = newInstance(Class.forName("java.time.LocalTime"));
        setLongField(term61299, term61299.getClass(), "id", -2725312432196215741L);
        setLongField(term61301, term61301.getClass(), "id", -4647685842587984295L);
        setLongField(term61303, term61303.getClass(), "id", -7620419977716696564L);
        setField(term61303, term61303.getClass(), "extId", term61305);
        setField(term61303, term61303.getClass(), "luid", "PlQZGGhnZK");
        setIntField(term61320, term61320.getClass(), "year", 2028);
        setShortField(term61320, term61320.getClass(), "month", (short) 2);
        setShortField(term61320, term61320.getClass(), "day", (short) 8);
        setField(term61319, term61319.getClass(), "date", term61320);
        setByteField(term61324, term61324.getClass(), "hour", (byte) 12);
        setByteField(term61324, term61324.getClass(), "minute", (byte) 27);
        setByteField(term61324, term61324.getClass(), "second", (byte) 18);
        setIntField(term61324, term61324.getClass(), "nano", 853147382);
        setField(term61319, term61319.getClass(), "time", term61324);
        setField(term61303, term61303.getClass(), "registerTime", term61319);
        setIntField(term61330, term61330.getClass(), "year", 2028);
        setShortField(term61330, term61330.getClass(), "month", (short) 10);
        setShortField(term61330, term61330.getClass(), "day", (short) 3);
        setField(term61329, term61329.getClass(), "date", term61330);
        setByteField(term61334, term61334.getClass(), "hour", (byte) 22);
        setByteField(term61334, term61334.getClass(), "minute", (byte) 20);
        setByteField(term61334, term61334.getClass(), "second", (byte) 16);
        setIntField(term61334, term61334.getClass(), "nano", 358560291);
        setField(term61329, term61329.getClass(), "time", term61334);
        setField(term61303, term61303.getClass(), "accessTime", term61329);
        setField(term61301, term61301.getClass(), "card", term61303);
        setField(term61301, term61301.getClass(), "userName", "sTtLCWDEPO");
        setIntField(term61352, term61352.getClass(), "year", 2018);
        setShortField(term61352, term61352.getClass(), "month", (short) 1);
        setShortField(term61352, term61352.getClass(), "day", (short) 24);
        setField(term61351, term61351.getClass(), "date", term61352);
        setByteField(term61356, term61356.getClass(), "hour", (byte) 11);
        setByteField(term61356, term61356.getClass(), "minute", (byte) 50);
        setByteField(term61356, term61356.getClass(), "second", (byte) 41);
        setIntField(term61356, term61356.getClass(), "nano", 402572098);
        setField(term61351, term61351.getClass(), "time", term61356);
        setField(term61301, term61301.getClass(), "lastLoginDate", term61351);
        setBooleanField(term61301, term61301.getClass(), "isWebJoin", false);
        setField(term61301, term61301.getClass(), "webLimitDate", "UGMtNRjhnC");
        setIntField(term61301, term61301.getClass(), "level", -1698291583);
        setIntField(term61301, term61301.getClass(), "reincarnationNum", -246710651);
        setField(term61301, term61301.getClass(), "exp", "oTnPmmIphJ");
        setLongField(term61301, term61301.getClass(), "point", 102282101180071600L);
        setLongField(term61301, term61301.getClass(), "totalPoint", -1795306210380148654L);
        setIntField(term61301, term61301.getClass(), "playCount", -374626618);
        setIntField(term61301, term61301.getClass(), "multiPlayCount", 1449690385);
        setIntField(term61301, term61301.getClass(), "multiWinCount", -1063098623);
        setIntField(term61301, term61301.getClass(), "requestResCount", 1519335351);
        setIntField(term61301, term61301.getClass(), "acceptResCount", 1995841517);
        setIntField(term61301, term61301.getClass(), "successResCount", -1865261069);
        setIntField(term61301, term61301.getClass(), "playerRating", 159666228);
        setIntField(term61301, term61301.getClass(), "highestRating", -1706840691);
        setIntField(term61301, term61301.getClass(), "nameplateId", -722277466);
        setIntField(term61301, term61301.getClass(), "frameId", 1000587160);
        setIntField(term61301, term61301.getClass(), "characterId", 1691425223);
        setIntField(term61301, term61301.getClass(), "trophyId", 2086385537);
        setIntField(term61301, term61301.getClass(), "playedTutorialBit", -898458301);
        setIntField(term61301, term61301.getClass(), "firstTutorialCancelNum", -1752896);
        setIntField(term61301, term61301.getClass(), "masterTutorialCancelNum", -1202458563);
        setIntField(term61301, term61301.getClass(), "totalRepertoireCount", -974221589);
        setIntField(term61301, term61301.getClass(), "totalMapNum", -167704667);
        setLongField(term61301, term61301.getClass(), "totalHiScore", -1441295073480062630L);
        setLongField(term61301, term61301.getClass(), "totalBasicHighScore", -4618196261828717815L);
        setLongField(term61301, term61301.getClass(), "totalAdvancedHighScore", -1396670214756396961L);
        setLongField(term61301, term61301.getClass(), "totalExpertHighScore", 1795641040165405529L);
        setLongField(term61301, term61301.getClass(), "totalMasterHighScore", 6002848910891080375L);
        setIntField(term61413, term61413.getClass(), "year", 2021);
        setShortField(term61413, term61413.getClass(), "month", (short) 11);
        setShortField(term61413, term61413.getClass(), "day", (short) 14);
        setField(term61412, term61412.getClass(), "date", term61413);
        setByteField(term61417, term61417.getClass(), "hour", (byte) 3);
        setByteField(term61417, term61417.getClass(), "minute", (byte) 30);
        setByteField(term61417, term61417.getClass(), "second", (byte) 36);
        setIntField(term61417, term61417.getClass(), "nano", 680228713);
        setField(term61412, term61412.getClass(), "time", term61417);
        setField(term61301, term61301.getClass(), "eventWatchedDate", term61412);
        setIntField(term61301, term61301.getClass(), "friendCount", -820617926);
        setBooleanField(term61301, term61301.getClass(), "isMaimai", false);
        setField(term61301, term61301.getClass(), "firstGameId", "vTgJolwQXF");
        setField(term61301, term61301.getClass(), "firstRomVersion", "QuNSfeKtAH");
        setField(term61301, term61301.getClass(), "firstDataVersion", "vFhRdscfFA");
        setIntField(term61461, term61461.getClass(), "year", 2011);
        setShortField(term61461, term61461.getClass(), "month", (short) 4);
        setShortField(term61461, term61461.getClass(), "day", (short) 30);
        setField(term61460, term61460.getClass(), "date", term61461);
        setByteField(term61465, term61465.getClass(), "hour", (byte) 5);
        setByteField(term61465, term61465.getClass(), "minute", (byte) 2);
        setByteField(term61465, term61465.getClass(), "second", (byte) 59);
        setIntField(term61465, term61465.getClass(), "nano", 800923694);
        setField(term61460, term61460.getClass(), "time", term61465);
        setField(term61301, term61301.getClass(), "firstPlayDate", term61460);
        setField(term61301, term61301.getClass(), "lastGameId", "ZmfocrvaII");
        setField(term61301, term61301.getClass(), "lastRomVersion", "LTbQXrGKuA");
        setField(term61301, term61301.getClass(), "lastDataVersion", "gzmGmDALUv");
        setIntField(term61507, term61507.getClass(), "year", 2027);
        setShortField(term61507, term61507.getClass(), "month", (short) 5);
        setShortField(term61507, term61507.getClass(), "day", (short) 8);
        setField(term61506, term61506.getClass(), "date", term61507);
        setByteField(term61511, term61511.getClass(), "hour", (byte) 4);
        setByteField(term61511, term61511.getClass(), "minute", (byte) 0);
        setByteField(term61511, term61511.getClass(), "second", (byte) 19);
        setIntField(term61511, term61511.getClass(), "nano", 400713347);
        setField(term61506, term61506.getClass(), "time", term61511);
        setField(term61301, term61301.getClass(), "lastPlayDate", term61506);
        setIntField(term61301, term61301.getClass(), "lastPlaceId", -1871142929);
        setField(term61301, term61301.getClass(), "lastPlaceName", "ZRoptBRTDM");
        setField(term61301, term61301.getClass(), "lastRegionId", "vVVFChfeBQ");
        setField(term61301, term61301.getClass(), "lastRegionName", "aASfcqfBbh");
        setField(term61301, term61301.getClass(), "lastAllNetId", "DwpOIkpRFT");
        setField(term61301, term61301.getClass(), "lastClientId", "LPlTDoLrUy");
        setField(term61299, term61299.getClass(), "user", term61301);
        setIntField(term61299, term61299.getClass(), "bgInfo", -1594964553);
        setIntField(term61299, term61299.getClass(), "fieldColor", -1839071263);
        setIntField(term61299, term61299.getClass(), "guideSound", 1247519674);
        setIntField(term61299, term61299.getClass(), "soundEffect", -460205484);
        setIntField(term61299, term61299.getClass(), "guideLine", -1144163240);
        setIntField(term61299, term61299.getClass(), "speed", 2135238175);
        setIntField(term61299, term61299.getClass(), "optionSet", -407365393);
        setIntField(term61299, term61299.getClass(), "matching", 1408195458);
        setIntField(term61299, term61299.getClass(), "judgePos", 1129173756);
        setIntField(term61299, term61299.getClass(), "rating", 267573446);
        setIntField(term61299, term61299.getClass(), "judgeJustice", -1319954987);
        setIntField(term61299, term61299.getClass(), "judgeAttack", 701324276);
        setIntField(term61299, term61299.getClass(), "headphone", -2141408767);
        setIntField(term61299, term61299.getClass(), "playerLevel", 2033366485);
        setIntField(term61299, term61299.getClass(), "successTap", 688731975);
        setIntField(term61299, term61299.getClass(), "successExTap", 1198340749);
        setIntField(term61299, term61299.getClass(), "successSlideHold", -385710681);
        setIntField(term61299, term61299.getClass(), "successAir", 1624133267);
        setIntField(term61299, term61299.getClass(), "successFlick", -1547947305);
        setIntField(term61299, term61299.getClass(), "successSkill", -919225635);
        setIntField(term61299, term61299.getClass(), "successTapTimbre", -1044514554);
        setIntField(term61299, term61299.getClass(), "privacy", 35189099);
        term61599 = new Integer(-1399937823);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.chunithm.model.userdata.UserGameOption");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = int.class;
        Object[] args = new Object[1];
        args[0] = term61599;
        callMethod(klass, "setBgInfo", argTypes, term61299, args);
    }

};


