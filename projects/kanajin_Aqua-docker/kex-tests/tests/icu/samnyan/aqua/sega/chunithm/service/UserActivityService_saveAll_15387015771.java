package icu.samnyan.aqua.sega.chunithm.service;

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
import static icu.samnyan.aqua.sega.chunithm.service.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.util.LinkedList;
import java.lang.Object;
import java.lang.Long;

public class UserActivityService_saveAll_15387015771 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term6055;

    public UserActivityService_saveAll_15387015771() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Long term6064 = new Long(-4920224193275732920L);
        Object term6058 = newInstance(Class.forName("icu.samnyan.aqua.sega.chunithm.model.userdata.UserActivity"));
        Object term6060 = newInstance(Class.forName("icu.samnyan.aqua.sega.chunithm.model.userdata.UserData"));
        Object term6062 = newInstance(Class.forName("icu.samnyan.aqua.sega.general.model.Card"));
        Object term6067 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term6097 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term6103 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term6107 = newInstance(Class.forName("java.time.LocalDateTime"));
        setLongField(term6058, term6058.getClass(), "id", -8614778293741404325L);
        setLongField(term6060, term6060.getClass(), "id", -5447369594017685765L);
        setLongField(term6062, term6062.getClass(), "id", -5724112525188606013L);
        setField(term6062, term6062.getClass(), "extId", term6064);
        setField(term6062, term6062.getClass(), "luid", null);
        setField(term6062, term6062.getClass(), "registerTime", null);
        setField(term6062, term6062.getClass(), "accessTime", null);
        setField(term6060, term6060.getClass(), "card", term6062);
        setField(term6060, term6060.getClass(), "userName", "");
        setField(term6067, term6067.getClass(), "date", null);
        setField(term6067, term6067.getClass(), "time", null);
        setField(term6060, term6060.getClass(), "lastLoginDate", term6067);
        setBooleanField(term6060, term6060.getClass(), "isWebJoin", false);
        setField(term6060, term6060.getClass(), "webLimitDate", "");
        setIntField(term6060, term6060.getClass(), "level", 754055848);
        setIntField(term6060, term6060.getClass(), "reincarnationNum", -19246901);
        setField(term6060, term6060.getClass(), "exp", "");
        setLongField(term6060, term6060.getClass(), "point", -6100012593724108983L);
        setLongField(term6060, term6060.getClass(), "totalPoint", 5465527210299101732L);
        setIntField(term6060, term6060.getClass(), "playCount", -370828664);
        setIntField(term6060, term6060.getClass(), "multiPlayCount", 1168633950);
        setIntField(term6060, term6060.getClass(), "multiWinCount", 1607082164);
        setIntField(term6060, term6060.getClass(), "requestResCount", 1890399366);
        setIntField(term6060, term6060.getClass(), "acceptResCount", -1867239125);
        setIntField(term6060, term6060.getClass(), "successResCount", 952869601);
        setIntField(term6060, term6060.getClass(), "playerRating", 91958879);
        setIntField(term6060, term6060.getClass(), "highestRating", -645429025);
        setIntField(term6060, term6060.getClass(), "nameplateId", -688213483);
        setIntField(term6060, term6060.getClass(), "frameId", 644154104);
        setIntField(term6060, term6060.getClass(), "characterId", 76650923);
        setIntField(term6060, term6060.getClass(), "trophyId", 1003743923);
        setIntField(term6060, term6060.getClass(), "playedTutorialBit", 1887772522);
        setIntField(term6060, term6060.getClass(), "firstTutorialCancelNum", 354196060);
        setIntField(term6060, term6060.getClass(), "masterTutorialCancelNum", -1840305774);
        setIntField(term6060, term6060.getClass(), "totalRepertoireCount", 1365087144);
        setIntField(term6060, term6060.getClass(), "totalMapNum", -1537255112);
        setLongField(term6060, term6060.getClass(), "totalHiScore", 4699157009689333952L);
        setLongField(term6060, term6060.getClass(), "totalBasicHighScore", -78240609295693193L);
        setLongField(term6060, term6060.getClass(), "totalAdvancedHighScore", 3090901538358721367L);
        setLongField(term6060, term6060.getClass(), "totalExpertHighScore", -1677189124507026637L);
        setLongField(term6060, term6060.getClass(), "totalMasterHighScore", 4795660804170399986L);
        setField(term6097, term6097.getClass(), "date", null);
        setField(term6097, term6097.getClass(), "time", null);
        setField(term6060, term6060.getClass(), "eventWatchedDate", term6097);
        setIntField(term6060, term6060.getClass(), "friendCount", 934477462);
        setBooleanField(term6060, term6060.getClass(), "isMaimai", false);
        setField(term6060, term6060.getClass(), "firstGameId", "");
        setField(term6060, term6060.getClass(), "firstRomVersion", "");
        setField(term6060, term6060.getClass(), "firstDataVersion", "");
        setField(term6103, term6103.getClass(), "date", null);
        setField(term6103, term6103.getClass(), "time", null);
        setField(term6060, term6060.getClass(), "firstPlayDate", term6103);
        setField(term6060, term6060.getClass(), "lastGameId", "");
        setField(term6060, term6060.getClass(), "lastRomVersion", "");
        setField(term6060, term6060.getClass(), "lastDataVersion", "");
        setField(term6107, term6107.getClass(), "date", null);
        setField(term6107, term6107.getClass(), "time", null);
        setField(term6060, term6060.getClass(), "lastPlayDate", term6107);
        setIntField(term6060, term6060.getClass(), "lastPlaceId", 4900410);
        setField(term6060, term6060.getClass(), "lastPlaceName", "");
        setField(term6060, term6060.getClass(), "lastRegionId", "");
        setField(term6060, term6060.getClass(), "lastRegionName", "");
        setField(term6060, term6060.getClass(), "lastAllNetId", "");
        setField(term6060, term6060.getClass(), "lastClientId", "");
        setField(term6058, term6058.getClass(), "user", term6060);
        setIntField(term6058, term6058.getClass(), "kind", -1252345779);
        setIntField(term6058, term6058.getClass(), "activityId", -2063365430);
        setIntField(term6058, term6058.getClass(), "sortNumber", 812570053);
        setIntField(term6058, term6058.getClass(), "param1", -1488938905);
        setIntField(term6058, term6058.getClass(), "param2", 1916544127);
        setIntField(term6058, term6058.getClass(), "param3", -1133405894);
        setIntField(term6058, term6058.getClass(), "param4", 1289741214);
        Object term6122 = newInstance(Class.forName("icu.samnyan.aqua.sega.chunithm.model.userdata.UserActivity"));
        Object term6124 = newInstance(Class.forName("icu.samnyan.aqua.sega.chunithm.model.userdata.UserData"));
        setLongField(term6122, term6122.getClass(), "id", -4030863184426321096L);
        setLongField(term6124, term6124.getClass(), "id", -8010214112439224349L);
        setField(term6124, term6124.getClass(), "card", null);
        setField(term6124, term6124.getClass(), "userName", null);
        setField(term6124, term6124.getClass(), "lastLoginDate", null);
        setBooleanField(term6124, term6124.getClass(), "isWebJoin", false);
        setField(term6124, term6124.getClass(), "webLimitDate", null);
        setIntField(term6124, term6124.getClass(), "level", 243280944);
        setIntField(term6124, term6124.getClass(), "reincarnationNum", -726681073);
        setField(term6124, term6124.getClass(), "exp", null);
        setLongField(term6124, term6124.getClass(), "point", 3412644969878030772L);
        setLongField(term6124, term6124.getClass(), "totalPoint", 6698455537431331246L);
        setIntField(term6124, term6124.getClass(), "playCount", -1724487863);
        setIntField(term6124, term6124.getClass(), "multiPlayCount", -128490829);
        setIntField(term6124, term6124.getClass(), "multiWinCount", 202214133);
        setIntField(term6124, term6124.getClass(), "requestResCount", 1543091617);
        setIntField(term6124, term6124.getClass(), "acceptResCount", -763166094);
        setIntField(term6124, term6124.getClass(), "successResCount", -222941705);
        setIntField(term6124, term6124.getClass(), "playerRating", 291864719);
        setIntField(term6124, term6124.getClass(), "highestRating", -1549607466);
        setIntField(term6124, term6124.getClass(), "nameplateId", 853609788);
        setIntField(term6124, term6124.getClass(), "frameId", -197820800);
        setIntField(term6124, term6124.getClass(), "characterId", 723812297);
        setIntField(term6124, term6124.getClass(), "trophyId", 1639448749);
        setIntField(term6124, term6124.getClass(), "playedTutorialBit", 873659088);
        setIntField(term6124, term6124.getClass(), "firstTutorialCancelNum", -975748721);
        setIntField(term6124, term6124.getClass(), "masterTutorialCancelNum", 433248783);
        setIntField(term6124, term6124.getClass(), "totalRepertoireCount", -507944154);
        setIntField(term6124, term6124.getClass(), "totalMapNum", -1736183862);
        setLongField(term6124, term6124.getClass(), "totalHiScore", -8327432141027603933L);
        setLongField(term6124, term6124.getClass(), "totalBasicHighScore", -433040798405298080L);
        setLongField(term6124, term6124.getClass(), "totalAdvancedHighScore", -1505191021111100819L);
        setLongField(term6124, term6124.getClass(), "totalExpertHighScore", -1000830646340880796L);
        setLongField(term6124, term6124.getClass(), "totalMasterHighScore", 5973526439563541711L);
        setField(term6124, term6124.getClass(), "eventWatchedDate", null);
        setIntField(term6124, term6124.getClass(), "friendCount", 897010381);
        setBooleanField(term6124, term6124.getClass(), "isMaimai", true);
        setField(term6124, term6124.getClass(), "firstGameId", null);
        setField(term6124, term6124.getClass(), "firstRomVersion", null);
        setField(term6124, term6124.getClass(), "firstDataVersion", null);
        setField(term6124, term6124.getClass(), "firstPlayDate", null);
        setField(term6124, term6124.getClass(), "lastGameId", null);
        setField(term6124, term6124.getClass(), "lastRomVersion", null);
        setField(term6124, term6124.getClass(), "lastDataVersion", null);
        setField(term6124, term6124.getClass(), "lastPlayDate", null);
        setIntField(term6124, term6124.getClass(), "lastPlaceId", -15712667);
        setField(term6124, term6124.getClass(), "lastPlaceName", null);
        setField(term6124, term6124.getClass(), "lastRegionId", null);
        setField(term6124, term6124.getClass(), "lastRegionName", null);
        setField(term6124, term6124.getClass(), "lastAllNetId", null);
        setField(term6124, term6124.getClass(), "lastClientId", null);
        setField(term6122, term6122.getClass(), "user", term6124);
        setIntField(term6122, term6122.getClass(), "kind", 1964967720);
        setIntField(term6122, term6122.getClass(), "activityId", 1351900243);
        setIntField(term6122, term6122.getClass(), "sortNumber", -330897705);
        setIntField(term6122, term6122.getClass(), "param1", 1065595802);
        setIntField(term6122, term6122.getClass(), "param2", 21031843);
        setIntField(term6122, term6122.getClass(), "param3", -380787857);
        setIntField(term6122, term6122.getClass(), "param4", 319853052);
        Object term6164 = newInstance(Class.forName("icu.samnyan.aqua.sega.chunithm.model.userdata.UserActivity"));
        setLongField(term6164, term6164.getClass(), "id", 5246058710498845622L);
        setField(term6164, term6164.getClass(), "user", null);
        setIntField(term6164, term6164.getClass(), "kind", 114279242);
        setIntField(term6164, term6164.getClass(), "activityId", 990883365);
        setIntField(term6164, term6164.getClass(), "sortNumber", 633598642);
        setIntField(term6164, term6164.getClass(), "param1", 1862841859);
        setIntField(term6164, term6164.getClass(), "param2", -1114668574);
        setIntField(term6164, term6164.getClass(), "param3", 514511037);
        setIntField(term6164, term6164.getClass(), "param4", 1713573821);
        term6055 = new LinkedList();
        ((LinkedList) term6055).add(term6058);
        ((LinkedList) term6055).add(term6122);
        ((LinkedList) term6055).add(term6164);
        ((LinkedList) term6055).add((Object)null);
        ((LinkedList) term6055).add((Object)null);
        ((LinkedList) term6055).add((Object)null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.chunithm.service.UserActivityService");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.util.List");
        Object[] args = new Object[1];
        args[0] = term6055;
        callMethod(klass, "saveAll", argTypes, null, args);
    }

};


