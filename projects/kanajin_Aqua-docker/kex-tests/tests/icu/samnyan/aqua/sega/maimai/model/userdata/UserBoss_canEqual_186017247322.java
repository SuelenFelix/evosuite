package icu.samnyan.aqua.sega.maimai.model.userdata;

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
import static icu.samnyan.aqua.sega.maimai.model.userdata.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.lang.Object;
import java.lang.Long;

public class UserBoss_canEqual_186017247322 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term95258;
     Object term95442;

    public UserBoss_canEqual_186017247322() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Long term95264 = new Long(-5344598381371854750L);
        term95258 = newInstance(Class.forName("icu.samnyan.aqua.sega.maimai.model.userdata.UserBoss"));
        Object term95260 = newInstance(Class.forName("icu.samnyan.aqua.sega.maimai.model.userdata.UserData"));
        Object term95262 = newInstance(Class.forName("icu.samnyan.aqua.sega.general.model.Card"));
        Object term95278 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term95279 = newInstance(Class.forName("java.time.LocalDate"));
        Object term95283 = newInstance(Class.forName("java.time.LocalTime"));
        Object term95288 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term95289 = newInstance(Class.forName("java.time.LocalDate"));
        Object term95293 = newInstance(Class.forName("java.time.LocalTime"));
        setLongField(term95258, term95258.getClass(), "id", -1059217926759861865L);
        setLongField(term95260, term95260.getClass(), "id", 4331712795558033930L);
        setLongField(term95262, term95262.getClass(), "id", 8180021874498524998L);
        setField(term95262, term95262.getClass(), "extId", term95264);
        setField(term95262, term95262.getClass(), "luid", "JApuaiAykc");
        setIntField(term95279, term95279.getClass(), "year", 2014);
        setShortField(term95279, term95279.getClass(), "month", (short) 3);
        setShortField(term95279, term95279.getClass(), "day", (short) 18);
        setField(term95278, term95278.getClass(), "date", term95279);
        setByteField(term95283, term95283.getClass(), "hour", (byte) 9);
        setByteField(term95283, term95283.getClass(), "minute", (byte) 35);
        setByteField(term95283, term95283.getClass(), "second", (byte) 23);
        setIntField(term95283, term95283.getClass(), "nano", 260496752);
        setField(term95278, term95278.getClass(), "time", term95283);
        setField(term95262, term95262.getClass(), "registerTime", term95278);
        setIntField(term95289, term95289.getClass(), "year", 2021);
        setShortField(term95289, term95289.getClass(), "month", (short) 7);
        setShortField(term95289, term95289.getClass(), "day", (short) 28);
        setField(term95288, term95288.getClass(), "date", term95289);
        setByteField(term95293, term95293.getClass(), "hour", (byte) 23);
        setByteField(term95293, term95293.getClass(), "minute", (byte) 12);
        setByteField(term95293, term95293.getClass(), "second", (byte) 32);
        setIntField(term95293, term95293.getClass(), "nano", 773887991);
        setField(term95288, term95288.getClass(), "time", term95293);
        setField(term95262, term95262.getClass(), "accessTime", term95288);
        setField(term95260, term95260.getClass(), "card", term95262);
        setIntField(term95260, term95260.getClass(), "lastDataVersion", 1275177499);
        setField(term95260, term95260.getClass(), "userName", "NJWFosJfXl");
        setIntField(term95260, term95260.getClass(), "point", 683701474);
        setIntField(term95260, term95260.getClass(), "totalPoint", 247947009);
        setIntField(term95260, term95260.getClass(), "iconId", 718686721);
        setIntField(term95260, term95260.getClass(), "nameplateId", -1912489972);
        setIntField(term95260, term95260.getClass(), "frameId", 380168858);
        setIntField(term95260, term95260.getClass(), "trophyId", 1684017550);
        setIntField(term95260, term95260.getClass(), "playCount", -1085067457);
        setIntField(term95260, term95260.getClass(), "playVsCount", -1171804799);
        setIntField(term95260, term95260.getClass(), "playSyncCount", -50658959);
        setIntField(term95260, term95260.getClass(), "winCount", -1244851072);
        setIntField(term95260, term95260.getClass(), "helpCount", -1127273572);
        setIntField(term95260, term95260.getClass(), "comboCount", -942505377);
        setIntField(term95260, term95260.getClass(), "feverCount", 1207786576);
        setIntField(term95260, term95260.getClass(), "totalHiScore", -95646854);
        setIntField(term95260, term95260.getClass(), "totalEasyHighScore", -1261061854);
        setIntField(term95260, term95260.getClass(), "totalBasicHighScore", 581616367);
        setIntField(term95260, term95260.getClass(), "totalAdvancedHighScore", 530249699);
        setIntField(term95260, term95260.getClass(), "totalExpertHighScore", 693000024);
        setIntField(term95260, term95260.getClass(), "totalMasterHighScore", -659244791);
        setIntField(term95260, term95260.getClass(), "totalReMasterHighScore", -1592022320);
        setIntField(term95260, term95260.getClass(), "totalHighSync", -1743070082);
        setIntField(term95260, term95260.getClass(), "totalEasySync", -1196577732);
        setIntField(term95260, term95260.getClass(), "totalBasicSync", 658985528);
        setIntField(term95260, term95260.getClass(), "totalAdvancedSync", -514950354);
        setIntField(term95260, term95260.getClass(), "totalExpertSync", -1467577794);
        setIntField(term95260, term95260.getClass(), "totalMasterSync", 1957000422);
        setIntField(term95260, term95260.getClass(), "totalReMasterSync", 1521595403);
        setIntField(term95260, term95260.getClass(), "playerRating", -1211596748);
        setIntField(term95260, term95260.getClass(), "highestRating", -607616145);
        setIntField(term95260, term95260.getClass(), "rankAuthTailId", -1504241847);
        setField(term95260, term95260.getClass(), "eventWatchedDate", "JraVClZLWB");
        setField(term95260, term95260.getClass(), "webLimitDate", "PxscjEhxGk");
        setIntField(term95260, term95260.getClass(), "challengeTrackPhase", -187711145);
        setIntField(term95260, term95260.getClass(), "firstPlayBits", 132086207);
        setField(term95260, term95260.getClass(), "lastPlayDate", "ePFnljQSHU");
        setIntField(term95260, term95260.getClass(), "lastPlaceId", -1371629267);
        setField(term95260, term95260.getClass(), "lastPlaceName", "wedLWAuOOY");
        setIntField(term95260, term95260.getClass(), "lastRegionId", 991981146);
        setField(term95260, term95260.getClass(), "lastRegionName", "oZDNpnQlCv");
        setField(term95260, term95260.getClass(), "lastClientId", "NdPeQAHWKN");
        setField(term95260, term95260.getClass(), "lastCountryCode", "giGQTpcQuV");
        setIntField(term95260, term95260.getClass(), "eventPoint", 1689577386);
        setIntField(term95260, term95260.getClass(), "totalLv", 20929363);
        setIntField(term95260, term95260.getClass(), "lastLoginBonusDay", 1997659725);
        setIntField(term95260, term95260.getClass(), "lastSurvivalBonusDay", -982053590);
        setIntField(term95260, term95260.getClass(), "loginBonusLv", -1866750250);
        setField(term95258, term95258.getClass(), "user", term95260);
        setLongField(term95258, term95258.getClass(), "pandoraFlagList0", 732331270654896650L);
        setLongField(term95258, term95258.getClass(), "pandoraFlagList1", 8578289401978257809L);
        setLongField(term95258, term95258.getClass(), "pandoraFlagList2", -1719189544794576143L);
        setLongField(term95258, term95258.getClass(), "pandoraFlagList3", 60910260492008727L);
        setLongField(term95258, term95258.getClass(), "pandoraFlagList4", 1696831840206676000L);
        setLongField(term95258, term95258.getClass(), "pandoraFlagList5", 6079978726138581731L);
        setLongField(term95258, term95258.getClass(), "pandoraFlagList6", 2001497540145118L);
        setLongField(term95258, term95258.getClass(), "emblemFlagList", -9048797705753068816L);
        term95442 = newInstance(Class.forName("java.lang.Object"));
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.maimai.model.userdata.UserBoss");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.Object");
        Object[] args = new Object[1];
        args[0] = term95442;
        callMethod(klass, "canEqual", argTypes, term95258, args);
    }

};


