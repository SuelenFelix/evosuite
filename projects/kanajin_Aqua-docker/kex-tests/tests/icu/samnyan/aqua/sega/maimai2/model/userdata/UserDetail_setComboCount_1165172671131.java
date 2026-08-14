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

public class UserDetail_setComboCount_1165172671131 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term270243;
     Object term270586;

    public UserDetail_setComboCount_1165172671131() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Long term270247 = new Long(-2286229228641472715L);
        ArrayList term270308 = new ArrayList();
        Integer term270314 = new Integer(351652776);
        Integer term270316 = new Integer(319658723);
        ArrayList term270312 = new ArrayList();
        ((ArrayList) term270312).add(term270314);
        ((ArrayList) term270312).add(term270316);
        term270243 = newInstance(Class.forName("icu.samnyan.aqua.sega.maimai2.model.userdata.UserDetail"));
        Object term270245 = newInstance(Class.forName("icu.samnyan.aqua.sega.general.model.Card"));
        Object term270261 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term270262 = newInstance(Class.forName("java.time.LocalDate"));
        Object term270266 = newInstance(Class.forName("java.time.LocalTime"));
        Object term270271 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term270272 = newInstance(Class.forName("java.time.LocalDate"));
        Object term270276 = newInstance(Class.forName("java.time.LocalTime"));
        setLongField(term270243, term270243.getClass(), "id", -9077786407994559752L);
        setLongField(term270245, term270245.getClass(), "id", -2378762852973567033L);
        setField(term270245, term270245.getClass(), "extId", term270247);
        setField(term270245, term270245.getClass(), "luid", "zUHSvWTyxk");
        setIntField(term270262, term270262.getClass(), "year", 2029);
        setShortField(term270262, term270262.getClass(), "month", (short) 7);
        setShortField(term270262, term270262.getClass(), "day", (short) 2);
        setField(term270261, term270261.getClass(), "date", term270262);
        setByteField(term270266, term270266.getClass(), "hour", (byte) 4);
        setByteField(term270266, term270266.getClass(), "minute", (byte) 58);
        setByteField(term270266, term270266.getClass(), "second", (byte) 25);
        setIntField(term270266, term270266.getClass(), "nano", 652407918);
        setField(term270261, term270261.getClass(), "time", term270266);
        setField(term270245, term270245.getClass(), "registerTime", term270261);
        setIntField(term270272, term270272.getClass(), "year", 2017);
        setShortField(term270272, term270272.getClass(), "month", (short) 1);
        setShortField(term270272, term270272.getClass(), "day", (short) 19);
        setField(term270271, term270271.getClass(), "date", term270272);
        setByteField(term270276, term270276.getClass(), "hour", (byte) 2);
        setByteField(term270276, term270276.getClass(), "minute", (byte) 18);
        setByteField(term270276, term270276.getClass(), "second", (byte) 26);
        setIntField(term270276, term270276.getClass(), "nano", 562246787);
        setField(term270271, term270271.getClass(), "time", term270276);
        setField(term270245, term270245.getClass(), "accessTime", term270271);
        setField(term270243, term270243.getClass(), "card", term270245);
        setField(term270243, term270243.getClass(), "userName", "BNWPFHqDSK");
        setIntField(term270243, term270243.getClass(), "isNetMember", -1886290435);
        setIntField(term270243, term270243.getClass(), "iconId", 1460206884);
        setIntField(term270243, term270243.getClass(), "plateId", 137412840);
        setIntField(term270243, term270243.getClass(), "titleId", -1655219028);
        setIntField(term270243, term270243.getClass(), "partnerId", -1234077444);
        setIntField(term270243, term270243.getClass(), "frameId", -1532039141);
        setIntField(term270243, term270243.getClass(), "selectMapId", 102729809);
        setIntField(term270243, term270243.getClass(), "totalAwake", -70958310);
        setIntField(term270243, term270243.getClass(), "gradeRating", -1525314773);
        setIntField(term270243, term270243.getClass(), "musicRating", -1014201932);
        setIntField(term270243, term270243.getClass(), "playerRating", 289914633);
        setIntField(term270243, term270243.getClass(), "highestRating", 686017027);
        setIntField(term270243, term270243.getClass(), "gradeRank", 421477030);
        setIntField(term270243, term270243.getClass(), "classRank", -960123414);
        setIntField(term270243, term270243.getClass(), "courseRank", 1397757474);
        setField(term270243, term270243.getClass(), "charaSlot", term270308);
        setField(term270243, term270243.getClass(), "charaLockSlot", term270312);
        setLongField(term270243, term270243.getClass(), "contentBit", 3547483176931604917L);
        setIntField(term270243, term270243.getClass(), "playCount", -671573795);
        setField(term270243, term270243.getClass(), "eventWatchedDate", "vrYaIwwcMN");
        setField(term270243, term270243.getClass(), "lastGameId", "LcVLocUBWS");
        setField(term270243, term270243.getClass(), "lastRomVersion", "joSmLtjBvB");
        setField(term270243, term270243.getClass(), "lastDataVersion", "wyNmzyMLQI");
        setField(term270243, term270243.getClass(), "lastLoginDate", "wiZrzOpgQw");
        setField(term270243, term270243.getClass(), "lastPlayDate", "WQqnouSTpD");
        setIntField(term270243, term270243.getClass(), "lastPlayCredit", 635263662);
        setIntField(term270243, term270243.getClass(), "lastPlayMode", 1087258868);
        setIntField(term270243, term270243.getClass(), "lastPlaceId", 2014258026);
        setField(term270243, term270243.getClass(), "lastPlaceName", "ytoXodivzA");
        setIntField(term270243, term270243.getClass(), "lastAllNetId", -782233621);
        setIntField(term270243, term270243.getClass(), "lastRegionId", -569715357);
        setField(term270243, term270243.getClass(), "lastRegionName", "sEcSjAkjSq");
        setField(term270243, term270243.getClass(), "lastClientId", "mSmFFGfsFJ");
        setField(term270243, term270243.getClass(), "lastCountryCode", "OIzsTPqaal");
        setIntField(term270243, term270243.getClass(), "lastSelectEMoney", -342108233);
        setIntField(term270243, term270243.getClass(), "lastSelectTicket", 976079562);
        setIntField(term270243, term270243.getClass(), "lastSelectCourse", -1634467885);
        setIntField(term270243, term270243.getClass(), "lastCountCourse", 805948883);
        setField(term270243, term270243.getClass(), "firstGameId", "oKvuWLXCZe");
        setField(term270243, term270243.getClass(), "firstRomVersion", "mlmKXwlNne");
        setField(term270243, term270243.getClass(), "firstDataVersion", "zzuYlgHeZM");
        setField(term270243, term270243.getClass(), "firstPlayDate", "WiwGVcBPdh");
        setField(term270243, term270243.getClass(), "compatibleCmVersion", "CAnHJCftOL");
        setField(term270243, term270243.getClass(), "dailyBonusDate", "IqESuvplNO");
        setField(term270243, term270243.getClass(), "dailyCourseBonusDate", "MuPoSwJnZo");
        setField(term270243, term270243.getClass(), "lastPairLoginDate", "EmSAPRRxNg");
        setField(term270243, term270243.getClass(), "lastTrialPlayDate", "fthdIgFyPe");
        setIntField(term270243, term270243.getClass(), "playVsCount", 1645409148);
        setIntField(term270243, term270243.getClass(), "playSyncCount", -1740875282);
        setIntField(term270243, term270243.getClass(), "winCount", -835860882);
        setIntField(term270243, term270243.getClass(), "helpCount", 740318771);
        setIntField(term270243, term270243.getClass(), "comboCount", -108718877);
        setLongField(term270243, term270243.getClass(), "totalDeluxscore", -141564927106715759L);
        setLongField(term270243, term270243.getClass(), "totalBasicDeluxscore", -5165619754359598730L);
        setLongField(term270243, term270243.getClass(), "totalAdvancedDeluxscore", 5959538221612200911L);
        setLongField(term270243, term270243.getClass(), "totalExpertDeluxscore", 8415455599059318149L);
        setLongField(term270243, term270243.getClass(), "totalMasterDeluxscore", -853890333139555860L);
        setLongField(term270243, term270243.getClass(), "totalReMasterDeluxscore", -3054076564347625233L);
        setIntField(term270243, term270243.getClass(), "totalSync", 747321898);
        setIntField(term270243, term270243.getClass(), "totalBasicSync", -1054022433);
        setIntField(term270243, term270243.getClass(), "totalAdvancedSync", -1999866261);
        setIntField(term270243, term270243.getClass(), "totalExpertSync", 218173974);
        setIntField(term270243, term270243.getClass(), "totalMasterSync", -71148389);
        setIntField(term270243, term270243.getClass(), "totalReMasterSync", -1782029594);
        setLongField(term270243, term270243.getClass(), "totalAchievement", 3042326305464387713L);
        setLongField(term270243, term270243.getClass(), "totalBasicAchievement", -1924099724165423001L);
        setLongField(term270243, term270243.getClass(), "totalAdvancedAchievement", -3758739181563231789L);
        setLongField(term270243, term270243.getClass(), "totalExpertAchievement", 484982678693191273L);
        setLongField(term270243, term270243.getClass(), "totalMasterAchievement", 2919350491642914464L);
        setLongField(term270243, term270243.getClass(), "totalReMasterAchievement", 6183889382713478562L);
        setLongField(term270243, term270243.getClass(), "playerOldRating", 6540572467739226394L);
        setLongField(term270243, term270243.getClass(), "playerNewRating", 5181793341077460366L);
        setIntField(term270243, term270243.getClass(), "banState", 647536343);
        setLongField(term270243, term270243.getClass(), "dateTime", 5513293329072847923L);
        term270586 = new Integer(-896132032);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.maimai2.model.userdata.UserDetail");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = int.class;
        Object[] args = new Object[1];
        args[0] = term270586;
        callMethod(klass, "setComboCount", argTypes, term270243, args);
    }

};


