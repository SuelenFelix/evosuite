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

public class UserCharge_canEqual_140560380014 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term129600;
     Object term129995;

    public UserCharge_canEqual_140560380014() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Long term129606 = new Long(-3954795081650780841L);
        Integer term129669 = new Integer(946727239);
        Integer term129671 = new Integer(349182490);
        Integer term129673 = new Integer(-353671511);
        Integer term129675 = new Integer(1598831363);
        Integer term129677 = new Integer(-690367798);
        Integer term129679 = new Integer(1863738073);
        Integer term129681 = new Integer(2009028243);
        Integer term129683 = new Integer(1900131331);
        ArrayList term129667 = new ArrayList();
        ((ArrayList) term129667).add(term129669);
        ((ArrayList) term129667).add(term129671);
        ((ArrayList) term129667).add(term129673);
        ((ArrayList) term129667).add(term129675);
        ((ArrayList) term129667).add(term129677);
        ((ArrayList) term129667).add(term129679);
        ((ArrayList) term129667).add(term129681);
        ((ArrayList) term129667).add(term129683);
        Integer term129689 = new Integer(-1489604464);
        Integer term129691 = new Integer(601642248);
        Integer term129693 = new Integer(-1186936928);
        Integer term129695 = new Integer(-315380004);
        Integer term129697 = new Integer(-1945754843);
        Integer term129699 = new Integer(-1512221115);
        ArrayList term129687 = new ArrayList();
        ((ArrayList) term129687).add(term129689);
        ((ArrayList) term129687).add(term129691);
        ((ArrayList) term129687).add(term129693);
        ((ArrayList) term129687).add(term129695);
        ((ArrayList) term129687).add(term129697);
        ((ArrayList) term129687).add(term129699);
        term129600 = newInstance(Class.forName("icu.samnyan.aqua.sega.maimai2.model.userdata.UserCharge"));
        Object term129602 = newInstance(Class.forName("icu.samnyan.aqua.sega.maimai2.model.userdata.UserDetail"));
        Object term129604 = newInstance(Class.forName("icu.samnyan.aqua.sega.general.model.Card"));
        Object term129620 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term129621 = newInstance(Class.forName("java.time.LocalDate"));
        Object term129625 = newInstance(Class.forName("java.time.LocalTime"));
        Object term129630 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term129631 = newInstance(Class.forName("java.time.LocalDate"));
        Object term129635 = newInstance(Class.forName("java.time.LocalTime"));
        setLongField(term129600, term129600.getClass(), "id", 180002764419338595L);
        setLongField(term129602, term129602.getClass(), "id", -7962448518424234345L);
        setLongField(term129604, term129604.getClass(), "id", -5034511656983081481L);
        setField(term129604, term129604.getClass(), "extId", term129606);
        setField(term129604, term129604.getClass(), "luid", "ZmarCjgmcB");
        setIntField(term129621, term129621.getClass(), "year", 2015);
        setShortField(term129621, term129621.getClass(), "month", (short) 5);
        setShortField(term129621, term129621.getClass(), "day", (short) 26);
        setField(term129620, term129620.getClass(), "date", term129621);
        setByteField(term129625, term129625.getClass(), "hour", (byte) 9);
        setByteField(term129625, term129625.getClass(), "minute", (byte) 34);
        setByteField(term129625, term129625.getClass(), "second", (byte) 10);
        setIntField(term129625, term129625.getClass(), "nano", 873043034);
        setField(term129620, term129620.getClass(), "time", term129625);
        setField(term129604, term129604.getClass(), "registerTime", term129620);
        setIntField(term129631, term129631.getClass(), "year", 2021);
        setShortField(term129631, term129631.getClass(), "month", (short) 11);
        setShortField(term129631, term129631.getClass(), "day", (short) 13);
        setField(term129630, term129630.getClass(), "date", term129631);
        setByteField(term129635, term129635.getClass(), "hour", (byte) 7);
        setByteField(term129635, term129635.getClass(), "minute", (byte) 27);
        setByteField(term129635, term129635.getClass(), "second", (byte) 1);
        setIntField(term129635, term129635.getClass(), "nano", 59611302);
        setField(term129630, term129630.getClass(), "time", term129635);
        setField(term129604, term129604.getClass(), "accessTime", term129630);
        setField(term129602, term129602.getClass(), "card", term129604);
        setField(term129602, term129602.getClass(), "userName", "zxUAROPAUu");
        setIntField(term129602, term129602.getClass(), "isNetMember", 895409963);
        setIntField(term129602, term129602.getClass(), "iconId", 1476827497);
        setIntField(term129602, term129602.getClass(), "plateId", -2093258796);
        setIntField(term129602, term129602.getClass(), "titleId", 444674138);
        setIntField(term129602, term129602.getClass(), "partnerId", 1966779557);
        setIntField(term129602, term129602.getClass(), "frameId", -1632216455);
        setIntField(term129602, term129602.getClass(), "selectMapId", 134123162);
        setIntField(term129602, term129602.getClass(), "totalAwake", 1270482013);
        setIntField(term129602, term129602.getClass(), "gradeRating", -304419371);
        setIntField(term129602, term129602.getClass(), "musicRating", -1565193689);
        setIntField(term129602, term129602.getClass(), "playerRating", 954482242);
        setIntField(term129602, term129602.getClass(), "highestRating", -1145866715);
        setIntField(term129602, term129602.getClass(), "gradeRank", -792401883);
        setIntField(term129602, term129602.getClass(), "classRank", -1513455266);
        setIntField(term129602, term129602.getClass(), "courseRank", 1576242915);
        setField(term129602, term129602.getClass(), "charaSlot", term129667);
        setField(term129602, term129602.getClass(), "charaLockSlot", term129687);
        setLongField(term129602, term129602.getClass(), "contentBit", 2294241049428445689L);
        setIntField(term129602, term129602.getClass(), "playCount", -13617495);
        setField(term129602, term129602.getClass(), "eventWatchedDate", "AkiPuZHqLZ");
        setField(term129602, term129602.getClass(), "lastGameId", "TtnjCbAnFU");
        setField(term129602, term129602.getClass(), "lastRomVersion", "SDOcDCgFQu");
        setField(term129602, term129602.getClass(), "lastDataVersion", "EcAlwSDsSg");
        setField(term129602, term129602.getClass(), "lastLoginDate", "GTUBaGksNm");
        setField(term129602, term129602.getClass(), "lastPlayDate", "ToitdBqCUa");
        setIntField(term129602, term129602.getClass(), "lastPlayCredit", -1165634173);
        setIntField(term129602, term129602.getClass(), "lastPlayMode", -634884793);
        setIntField(term129602, term129602.getClass(), "lastPlaceId", 1476138937);
        setField(term129602, term129602.getClass(), "lastPlaceName", "hQkaYinNHN");
        setIntField(term129602, term129602.getClass(), "lastAllNetId", 1547525653);
        setIntField(term129602, term129602.getClass(), "lastRegionId", 244752248);
        setField(term129602, term129602.getClass(), "lastRegionName", "tinrcZBfby");
        setField(term129602, term129602.getClass(), "lastClientId", "fHZvVFVpCX");
        setField(term129602, term129602.getClass(), "lastCountryCode", "laRdIPzkwz");
        setIntField(term129602, term129602.getClass(), "lastSelectEMoney", -354095413);
        setIntField(term129602, term129602.getClass(), "lastSelectTicket", 1842115165);
        setIntField(term129602, term129602.getClass(), "lastSelectCourse", 809042157);
        setIntField(term129602, term129602.getClass(), "lastCountCourse", 123189112);
        setField(term129602, term129602.getClass(), "firstGameId", "siIcTJzSGr");
        setField(term129602, term129602.getClass(), "firstRomVersion", "IyfKbexwMT");
        setField(term129602, term129602.getClass(), "firstDataVersion", "rqqFczqbjO");
        setField(term129602, term129602.getClass(), "firstPlayDate", "fhhYQGiExU");
        setField(term129602, term129602.getClass(), "compatibleCmVersion", "poqEkIMUQX");
        setField(term129602, term129602.getClass(), "dailyBonusDate", "SLVaFTiZJu");
        setField(term129602, term129602.getClass(), "dailyCourseBonusDate", "BFwLWMcFzQ");
        setField(term129602, term129602.getClass(), "lastPairLoginDate", "ueMjdaYJqr");
        setField(term129602, term129602.getClass(), "lastTrialPlayDate", "IkmVfYlXcX");
        setIntField(term129602, term129602.getClass(), "playVsCount", 1409363541);
        setIntField(term129602, term129602.getClass(), "playSyncCount", -529449674);
        setIntField(term129602, term129602.getClass(), "winCount", -2050329736);
        setIntField(term129602, term129602.getClass(), "helpCount", 1971429499);
        setIntField(term129602, term129602.getClass(), "comboCount", 761194460);
        setLongField(term129602, term129602.getClass(), "totalDeluxscore", -4428406875939495103L);
        setLongField(term129602, term129602.getClass(), "totalBasicDeluxscore", 251205446189774619L);
        setLongField(term129602, term129602.getClass(), "totalAdvancedDeluxscore", 7494616801718312435L);
        setLongField(term129602, term129602.getClass(), "totalExpertDeluxscore", 7015036847228295050L);
        setLongField(term129602, term129602.getClass(), "totalMasterDeluxscore", -4914451098628831553L);
        setLongField(term129602, term129602.getClass(), "totalReMasterDeluxscore", 6171184492519640340L);
        setIntField(term129602, term129602.getClass(), "totalSync", 2101170479);
        setIntField(term129602, term129602.getClass(), "totalBasicSync", 1016127323);
        setIntField(term129602, term129602.getClass(), "totalAdvancedSync", -1424228916);
        setIntField(term129602, term129602.getClass(), "totalExpertSync", -1330367712);
        setIntField(term129602, term129602.getClass(), "totalMasterSync", 1127423658);
        setIntField(term129602, term129602.getClass(), "totalReMasterSync", 1769148291);
        setLongField(term129602, term129602.getClass(), "totalAchievement", -7456060183040854427L);
        setLongField(term129602, term129602.getClass(), "totalBasicAchievement", -2127992200468340889L);
        setLongField(term129602, term129602.getClass(), "totalAdvancedAchievement", 7975033780430202348L);
        setLongField(term129602, term129602.getClass(), "totalExpertAchievement", -5537620848003018760L);
        setLongField(term129602, term129602.getClass(), "totalMasterAchievement", -5183723444715290833L);
        setLongField(term129602, term129602.getClass(), "totalReMasterAchievement", 3528662942109485094L);
        setLongField(term129602, term129602.getClass(), "playerOldRating", -5648810601072873062L);
        setLongField(term129602, term129602.getClass(), "playerNewRating", -8417415277600307810L);
        setIntField(term129602, term129602.getClass(), "banState", -589939936);
        setLongField(term129602, term129602.getClass(), "dateTime", 2306272618983280437L);
        setField(term129600, term129600.getClass(), "user", term129602);
        setIntField(term129600, term129600.getClass(), "chargeId", -1648554957);
        setIntField(term129600, term129600.getClass(), "stock", -562928205);
        setField(term129600, term129600.getClass(), "purchaseDate", "WIAcrtkMRk");
        setField(term129600, term129600.getClass(), "validDate", "HulasQmWEg");
        term129995 = newInstance(Class.forName("java.lang.Object"));
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.maimai2.model.userdata.UserCharge");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.Object");
        Object[] args = new Object[1];
        args[0] = term129995;
        callMethod(klass, "canEqual", argTypes, term129600, args);
    }

};


