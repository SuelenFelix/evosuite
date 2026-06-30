package icu.samnyan.aqua.sega.maimai2.model.userdata;

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
import static icu.samnyan.aqua.sega.maimai2.model.userdata.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.lang.Object;
import java.lang.Long;
import java.util.ArrayList;
import java.lang.Integer;

public class UserItem_isValid_7449184726 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term36359;

    public UserItem_isValid_7449184726() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Long term36365 = new Long(-2644215923136513282L);
        Integer term36428 = new Integer(1639448749);
        Integer term36430 = new Integer(873659088);
        Integer term36432 = new Integer(-975748721);
        Integer term36434 = new Integer(433248783);
        Integer term36436 = new Integer(-507944154);
        Integer term36438 = new Integer(-1736183862);
        ArrayList term36426 = new ArrayList();
        ((ArrayList) term36426).add(term36428);
        ((ArrayList) term36426).add(term36430);
        ((ArrayList) term36426).add(term36432);
        ((ArrayList) term36426).add(term36434);
        ((ArrayList) term36426).add(term36436);
        ((ArrayList) term36426).add(term36438);
        Integer term36444 = new Integer(897010381);
        ArrayList term36442 = new ArrayList();
        ((ArrayList) term36442).add(term36444);
        term36359 = newInstance(Class.forName("icu.samnyan.aqua.sega.maimai2.model.userdata.UserItem"));
        Object term36361 = newInstance(Class.forName("icu.samnyan.aqua.sega.maimai2.model.userdata.UserDetail"));
        Object term36363 = newInstance(Class.forName("icu.samnyan.aqua.sega.general.model.Card"));
        Object term36379 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term36380 = newInstance(Class.forName("java.time.LocalDate"));
        Object term36384 = newInstance(Class.forName("java.time.LocalTime"));
        Object term36389 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term36390 = newInstance(Class.forName("java.time.LocalDate"));
        Object term36394 = newInstance(Class.forName("java.time.LocalTime"));
        setLongField(term36359, term36359.getClass(), "id", -1337024735423070709L);
        setLongField(term36361, term36361.getClass(), "id", 5406702435763021326L);
        setLongField(term36363, term36363.getClass(), "id", 2674610463314008194L);
        setField(term36363, term36363.getClass(), "extId", term36365);
        setField(term36363, term36363.getClass(), "luid", "KnnoLMOuur");
        setIntField(term36380, term36380.getClass(), "year", 2013);
        setShortField(term36380, term36380.getClass(), "month", (short) 7);
        setShortField(term36380, term36380.getClass(), "day", (short) 3);
        setField(term36379, term36379.getClass(), "date", term36380);
        setByteField(term36384, term36384.getClass(), "hour", (byte) 10);
        setByteField(term36384, term36384.getClass(), "minute", (byte) 59);
        setByteField(term36384, term36384.getClass(), "second", (byte) 22);
        setIntField(term36384, term36384.getClass(), "nano", 937921480);
        setField(term36379, term36379.getClass(), "time", term36384);
        setField(term36363, term36363.getClass(), "registerTime", term36379);
        setIntField(term36390, term36390.getClass(), "year", 2012);
        setShortField(term36390, term36390.getClass(), "month", (short) 2);
        setShortField(term36390, term36390.getClass(), "day", (short) 29);
        setField(term36389, term36389.getClass(), "date", term36390);
        setByteField(term36394, term36394.getClass(), "hour", (byte) 14);
        setByteField(term36394, term36394.getClass(), "minute", (byte) 26);
        setByteField(term36394, term36394.getClass(), "second", (byte) 20);
        setIntField(term36394, term36394.getClass(), "nano", 780823452);
        setField(term36389, term36389.getClass(), "time", term36394);
        setField(term36363, term36363.getClass(), "accessTime", term36389);
        setField(term36361, term36361.getClass(), "card", term36363);
        setField(term36361, term36361.getClass(), "userName", "buRpVghIvt");
        setIntField(term36361, term36361.getClass(), "isNetMember", 1488144730);
        setIntField(term36361, term36361.getClass(), "iconId", -1075257608);
        setIntField(term36361, term36361.getClass(), "plateId", -693529847);
        setIntField(term36361, term36361.getClass(), "titleId", -325187625);
        setIntField(term36361, term36361.getClass(), "partnerId", -317484961);
        setIntField(term36361, term36361.getClass(), "frameId", 418080259);
        setIntField(term36361, term36361.getClass(), "selectMapId", 657195865);
        setIntField(term36361, term36361.getClass(), "totalAwake", 1397647176);
        setIntField(term36361, term36361.getClass(), "gradeRating", -1375675721);
        setIntField(term36361, term36361.getClass(), "musicRating", 456313553);
        setIntField(term36361, term36361.getClass(), "playerRating", 1636460194);
        setIntField(term36361, term36361.getClass(), "highestRating", -1926178417);
        setIntField(term36361, term36361.getClass(), "gradeRank", -1011180309);
        setIntField(term36361, term36361.getClass(), "classRank", -342719145);
        setIntField(term36361, term36361.getClass(), "courseRank", 2101766592);
        setField(term36361, term36361.getClass(), "charaSlot", term36426);
        setField(term36361, term36361.getClass(), "charaLockSlot", term36442);
        setLongField(term36361, term36361.getClass(), "contentBit", 4782766292773586077L);
        setIntField(term36361, term36361.getClass(), "playCount", 802196878);
        setField(term36361, term36361.getClass(), "eventWatchedDate", "oTGxFdiaIW");
        setField(term36361, term36361.getClass(), "lastGameId", "jlyFvaZlmv");
        setField(term36361, term36361.getClass(), "lastRomVersion", "sofyLEfomV");
        setField(term36361, term36361.getClass(), "lastDataVersion", "zHcDSJHKAb");
        setField(term36361, term36361.getClass(), "lastLoginDate", "WRIQkTdeMl");
        setField(term36361, term36361.getClass(), "lastPlayDate", "rLSEheWsHd");
        setIntField(term36361, term36361.getClass(), "lastPlayCredit", -174401540);
        setIntField(term36361, term36361.getClass(), "lastPlayMode", -1881073314);
        setIntField(term36361, term36361.getClass(), "lastPlaceId", -1902513009);
        setField(term36361, term36361.getClass(), "lastPlaceName", "DoUKDhlGCY");
        setIntField(term36361, term36361.getClass(), "lastAllNetId", 1810303681);
        setIntField(term36361, term36361.getClass(), "lastRegionId", 1374798468);
        setField(term36361, term36361.getClass(), "lastRegionName", "IeoToWsQWU");
        setField(term36361, term36361.getClass(), "lastClientId", "QxiiHtQAzN");
        setField(term36361, term36361.getClass(), "lastCountryCode", "gQgTBlRIvX");
        setIntField(term36361, term36361.getClass(), "lastSelectEMoney", -425364766);
        setIntField(term36361, term36361.getClass(), "lastSelectTicket", -240455247);
        setIntField(term36361, term36361.getClass(), "lastSelectCourse", 412243891);
        setIntField(term36361, term36361.getClass(), "lastCountCourse", -1517264869);
        setField(term36361, term36361.getClass(), "firstGameId", "ulKaKnANzj");
        setField(term36361, term36361.getClass(), "firstRomVersion", "ABwhdjjeJi");
        setField(term36361, term36361.getClass(), "firstDataVersion", "KKEcpYXNZV");
        setField(term36361, term36361.getClass(), "firstPlayDate", "shLHFznysy");
        setField(term36361, term36361.getClass(), "compatibleCmVersion", "YCKIloBHLj");
        setField(term36361, term36361.getClass(), "dailyBonusDate", "qUWDhAeFJY");
        setField(term36361, term36361.getClass(), "dailyCourseBonusDate", "wboNBMhRjP");
        setField(term36361, term36361.getClass(), "lastPairLoginDate", "HZODpafOGe");
        setField(term36361, term36361.getClass(), "lastTrialPlayDate", "dUTYEKtTfQ");
        setIntField(term36361, term36361.getClass(), "playVsCount", 1498231709);
        setIntField(term36361, term36361.getClass(), "playSyncCount", -775074162);
        setIntField(term36361, term36361.getClass(), "winCount", 304255923);
        setIntField(term36361, term36361.getClass(), "helpCount", 1532668668);
        setIntField(term36361, term36361.getClass(), "comboCount", -100547107);
        setLongField(term36361, term36361.getClass(), "totalDeluxscore", -1368803674967453727L);
        setLongField(term36361, term36361.getClass(), "totalBasicDeluxscore", -1596516630146686041L);
        setLongField(term36361, term36361.getClass(), "totalAdvancedDeluxscore", -8370506620911901379L);
        setLongField(term36361, term36361.getClass(), "totalExpertDeluxscore", -7185067999629587082L);
        setLongField(term36361, term36361.getClass(), "totalMasterDeluxscore", 8819168165968601827L);
        setLongField(term36361, term36361.getClass(), "totalReMasterDeluxscore", -5212780037221633520L);
        setIntField(term36361, term36361.getClass(), "totalSync", 2140567451);
        setIntField(term36361, term36361.getClass(), "totalBasicSync", -390400057);
        setIntField(term36361, term36361.getClass(), "totalAdvancedSync", -157273113);
        setIntField(term36361, term36361.getClass(), "totalExpertSync", 1497057438);
        setIntField(term36361, term36361.getClass(), "totalMasterSync", 1526060255);
        setIntField(term36361, term36361.getClass(), "totalReMasterSync", -833785119);
        setLongField(term36361, term36361.getClass(), "totalAchievement", -1622196407723421321L);
        setLongField(term36361, term36361.getClass(), "totalBasicAchievement", 5587445443876887300L);
        setLongField(term36361, term36361.getClass(), "totalAdvancedAchievement", -8147385208615265440L);
        setLongField(term36361, term36361.getClass(), "totalExpertAchievement", 2169332993170315110L);
        setLongField(term36361, term36361.getClass(), "totalMasterAchievement", -4266854609277222301L);
        setLongField(term36361, term36361.getClass(), "totalReMasterAchievement", -3517544832850746345L);
        setLongField(term36361, term36361.getClass(), "playerOldRating", -8129901089598682226L);
        setLongField(term36361, term36361.getClass(), "playerNewRating", -2740731095268174775L);
        setIntField(term36361, term36361.getClass(), "banState", -1920705464);
        setLongField(term36361, term36361.getClass(), "dateTime", 1434994695522862422L);
        setField(term36359, term36359.getClass(), "user", term36361);
        setIntField(term36359, term36359.getClass(), "itemKind", 428714196);
        setIntField(term36359, term36359.getClass(), "itemId", 934939315);
        setIntField(term36359, term36359.getClass(), "stock", -935897776);
        setBooleanField(term36359, term36359.getClass(), "isValid", false);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.maimai2.model.userdata.UserItem");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "isValid", argTypes, term36359, args);
    }

};


