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

public class UserDetail_setComboCount_1165172671132 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term270298;
     Object term270641;

    public UserDetail_setComboCount_1165172671132() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Long term270302 = new Long(-2286229228641472715L);
        ArrayList term270363 = new ArrayList();
        Integer term270369 = new Integer(351652776);
        Integer term270371 = new Integer(319658723);
        ArrayList term270367 = new ArrayList();
        ((ArrayList) term270367).add(term270369);
        ((ArrayList) term270367).add(term270371);
        term270298 = newInstance(Class.forName("icu.samnyan.aqua.sega.maimai2.model.userdata.UserDetail"));
        Object term270300 = newInstance(Class.forName("icu.samnyan.aqua.sega.general.model.Card"));
        Object term270316 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term270317 = newInstance(Class.forName("java.time.LocalDate"));
        Object term270321 = newInstance(Class.forName("java.time.LocalTime"));
        Object term270326 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term270327 = newInstance(Class.forName("java.time.LocalDate"));
        Object term270331 = newInstance(Class.forName("java.time.LocalTime"));
        setLongField(term270298, term270298.getClass(), "id", -9077786407994559752L);
        setLongField(term270300, term270300.getClass(), "id", -2378762852973567033L);
        setField(term270300, term270300.getClass(), "extId", term270302);
        setField(term270300, term270300.getClass(), "luid", "zUHSvWTyxk");
        setIntField(term270317, term270317.getClass(), "year", 2029);
        setShortField(term270317, term270317.getClass(), "month", (short) 7);
        setShortField(term270317, term270317.getClass(), "day", (short) 2);
        setField(term270316, term270316.getClass(), "date", term270317);
        setByteField(term270321, term270321.getClass(), "hour", (byte) 4);
        setByteField(term270321, term270321.getClass(), "minute", (byte) 58);
        setByteField(term270321, term270321.getClass(), "second", (byte) 25);
        setIntField(term270321, term270321.getClass(), "nano", 652407918);
        setField(term270316, term270316.getClass(), "time", term270321);
        setField(term270300, term270300.getClass(), "registerTime", term270316);
        setIntField(term270327, term270327.getClass(), "year", 2017);
        setShortField(term270327, term270327.getClass(), "month", (short) 1);
        setShortField(term270327, term270327.getClass(), "day", (short) 19);
        setField(term270326, term270326.getClass(), "date", term270327);
        setByteField(term270331, term270331.getClass(), "hour", (byte) 2);
        setByteField(term270331, term270331.getClass(), "minute", (byte) 18);
        setByteField(term270331, term270331.getClass(), "second", (byte) 26);
        setIntField(term270331, term270331.getClass(), "nano", 562246787);
        setField(term270326, term270326.getClass(), "time", term270331);
        setField(term270300, term270300.getClass(), "accessTime", term270326);
        setField(term270298, term270298.getClass(), "card", term270300);
        setField(term270298, term270298.getClass(), "userName", "BNWPFHqDSK");
        setIntField(term270298, term270298.getClass(), "isNetMember", -1886290435);
        setIntField(term270298, term270298.getClass(), "iconId", 1460206884);
        setIntField(term270298, term270298.getClass(), "plateId", 137412840);
        setIntField(term270298, term270298.getClass(), "titleId", -1655219028);
        setIntField(term270298, term270298.getClass(), "partnerId", -1234077444);
        setIntField(term270298, term270298.getClass(), "frameId", -1532039141);
        setIntField(term270298, term270298.getClass(), "selectMapId", 102729809);
        setIntField(term270298, term270298.getClass(), "totalAwake", -70958310);
        setIntField(term270298, term270298.getClass(), "gradeRating", -1525314773);
        setIntField(term270298, term270298.getClass(), "musicRating", -1014201932);
        setIntField(term270298, term270298.getClass(), "playerRating", 289914633);
        setIntField(term270298, term270298.getClass(), "highestRating", 686017027);
        setIntField(term270298, term270298.getClass(), "gradeRank", 421477030);
        setIntField(term270298, term270298.getClass(), "classRank", -960123414);
        setIntField(term270298, term270298.getClass(), "courseRank", 1397757474);
        setField(term270298, term270298.getClass(), "charaSlot", term270363);
        setField(term270298, term270298.getClass(), "charaLockSlot", term270367);
        setLongField(term270298, term270298.getClass(), "contentBit", 3547483176931604917L);
        setIntField(term270298, term270298.getClass(), "playCount", -671573795);
        setField(term270298, term270298.getClass(), "eventWatchedDate", "vrYaIwwcMN");
        setField(term270298, term270298.getClass(), "lastGameId", "LcVLocUBWS");
        setField(term270298, term270298.getClass(), "lastRomVersion", "joSmLtjBvB");
        setField(term270298, term270298.getClass(), "lastDataVersion", "wyNmzyMLQI");
        setField(term270298, term270298.getClass(), "lastLoginDate", "wiZrzOpgQw");
        setField(term270298, term270298.getClass(), "lastPlayDate", "WQqnouSTpD");
        setIntField(term270298, term270298.getClass(), "lastPlayCredit", 635263662);
        setIntField(term270298, term270298.getClass(), "lastPlayMode", 1087258868);
        setIntField(term270298, term270298.getClass(), "lastPlaceId", 2014258026);
        setField(term270298, term270298.getClass(), "lastPlaceName", "ytoXodivzA");
        setIntField(term270298, term270298.getClass(), "lastAllNetId", -782233621);
        setIntField(term270298, term270298.getClass(), "lastRegionId", -569715357);
        setField(term270298, term270298.getClass(), "lastRegionName", "sEcSjAkjSq");
        setField(term270298, term270298.getClass(), "lastClientId", "mSmFFGfsFJ");
        setField(term270298, term270298.getClass(), "lastCountryCode", "OIzsTPqaal");
        setIntField(term270298, term270298.getClass(), "lastSelectEMoney", -342108233);
        setIntField(term270298, term270298.getClass(), "lastSelectTicket", 976079562);
        setIntField(term270298, term270298.getClass(), "lastSelectCourse", -1634467885);
        setIntField(term270298, term270298.getClass(), "lastCountCourse", 805948883);
        setField(term270298, term270298.getClass(), "firstGameId", "oKvuWLXCZe");
        setField(term270298, term270298.getClass(), "firstRomVersion", "mlmKXwlNne");
        setField(term270298, term270298.getClass(), "firstDataVersion", "zzuYlgHeZM");
        setField(term270298, term270298.getClass(), "firstPlayDate", "WiwGVcBPdh");
        setField(term270298, term270298.getClass(), "compatibleCmVersion", "CAnHJCftOL");
        setField(term270298, term270298.getClass(), "dailyBonusDate", "IqESuvplNO");
        setField(term270298, term270298.getClass(), "dailyCourseBonusDate", "MuPoSwJnZo");
        setField(term270298, term270298.getClass(), "lastPairLoginDate", "EmSAPRRxNg");
        setField(term270298, term270298.getClass(), "lastTrialPlayDate", "fthdIgFyPe");
        setIntField(term270298, term270298.getClass(), "playVsCount", 1645409148);
        setIntField(term270298, term270298.getClass(), "playSyncCount", -1740875282);
        setIntField(term270298, term270298.getClass(), "winCount", -835860882);
        setIntField(term270298, term270298.getClass(), "helpCount", 740318771);
        setIntField(term270298, term270298.getClass(), "comboCount", -108718877);
        setLongField(term270298, term270298.getClass(), "totalDeluxscore", -141564927106715759L);
        setLongField(term270298, term270298.getClass(), "totalBasicDeluxscore", -5165619754359598730L);
        setLongField(term270298, term270298.getClass(), "totalAdvancedDeluxscore", 5959538221612200911L);
        setLongField(term270298, term270298.getClass(), "totalExpertDeluxscore", 8415455599059318149L);
        setLongField(term270298, term270298.getClass(), "totalMasterDeluxscore", -853890333139555860L);
        setLongField(term270298, term270298.getClass(), "totalReMasterDeluxscore", -3054076564347625233L);
        setIntField(term270298, term270298.getClass(), "totalSync", 747321898);
        setIntField(term270298, term270298.getClass(), "totalBasicSync", -1054022433);
        setIntField(term270298, term270298.getClass(), "totalAdvancedSync", -1999866261);
        setIntField(term270298, term270298.getClass(), "totalExpertSync", 218173974);
        setIntField(term270298, term270298.getClass(), "totalMasterSync", -71148389);
        setIntField(term270298, term270298.getClass(), "totalReMasterSync", -1782029594);
        setLongField(term270298, term270298.getClass(), "totalAchievement", 3042326305464387713L);
        setLongField(term270298, term270298.getClass(), "totalBasicAchievement", -1924099724165423001L);
        setLongField(term270298, term270298.getClass(), "totalAdvancedAchievement", -3758739181563231789L);
        setLongField(term270298, term270298.getClass(), "totalExpertAchievement", 484982678693191273L);
        setLongField(term270298, term270298.getClass(), "totalMasterAchievement", 2919350491642914464L);
        setLongField(term270298, term270298.getClass(), "totalReMasterAchievement", 6183889382713478562L);
        setLongField(term270298, term270298.getClass(), "playerOldRating", 6540572467739226394L);
        setLongField(term270298, term270298.getClass(), "playerNewRating", 5181793341077460366L);
        setIntField(term270298, term270298.getClass(), "banState", 647536343);
        setLongField(term270298, term270298.getClass(), "dateTime", 5513293329072847923L);
        term270641 = new Integer(-896132032);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.maimai2.model.userdata.UserDetail");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = int.class;
        Object[] args = new Object[1];
        args[0] = term270641;
        callMethod(klass, "setComboCount", argTypes, term270298, args);
    }

};


