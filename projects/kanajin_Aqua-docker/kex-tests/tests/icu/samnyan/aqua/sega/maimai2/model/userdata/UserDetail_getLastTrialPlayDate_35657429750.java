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

public class UserDetail_getLastTrialPlayDate_35657429750 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term223388;

    public UserDetail_getLastTrialPlayDate_35657429750() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Long term223392 = new Long(-421166328269063791L);
        Integer term223455 = new Integer(692290973);
        Integer term223457 = new Integer(344667712);
        Integer term223459 = new Integer(921447346);
        Integer term223461 = new Integer(1514227664);
        Integer term223463 = new Integer(2000874140);
        Integer term223465 = new Integer(-701728269);
        ArrayList term223453 = new ArrayList();
        ((ArrayList) term223453).add(term223455);
        ((ArrayList) term223453).add(term223457);
        ((ArrayList) term223453).add(term223459);
        ((ArrayList) term223453).add(term223461);
        ((ArrayList) term223453).add(term223463);
        ((ArrayList) term223453).add(term223465);
        Integer term223471 = new Integer(-1094813190);
        Integer term223473 = new Integer(-355401879);
        Integer term223475 = new Integer(-1878519758);
        ArrayList term223469 = new ArrayList();
        ((ArrayList) term223469).add(term223471);
        ((ArrayList) term223469).add(term223473);
        ((ArrayList) term223469).add(term223475);
        term223388 = newInstance(Class.forName("icu.samnyan.aqua.sega.maimai2.model.userdata.UserDetail"));
        Object term223390 = newInstance(Class.forName("icu.samnyan.aqua.sega.general.model.Card"));
        Object term223406 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term223407 = newInstance(Class.forName("java.time.LocalDate"));
        Object term223411 = newInstance(Class.forName("java.time.LocalTime"));
        Object term223416 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term223417 = newInstance(Class.forName("java.time.LocalDate"));
        Object term223421 = newInstance(Class.forName("java.time.LocalTime"));
        setLongField(term223388, term223388.getClass(), "id", 1918233396303860114L);
        setLongField(term223390, term223390.getClass(), "id", -8697608146515998914L);
        setField(term223390, term223390.getClass(), "extId", term223392);
        setField(term223390, term223390.getClass(), "luid", "dNnvcFIEqu");
        setIntField(term223407, term223407.getClass(), "year", 2028);
        setShortField(term223407, term223407.getClass(), "month", (short) 3);
        setShortField(term223407, term223407.getClass(), "day", (short) 23);
        setField(term223406, term223406.getClass(), "date", term223407);
        setByteField(term223411, term223411.getClass(), "hour", (byte) 18);
        setByteField(term223411, term223411.getClass(), "minute", (byte) 27);
        setByteField(term223411, term223411.getClass(), "second", (byte) 54);
        setIntField(term223411, term223411.getClass(), "nano", 421491474);
        setField(term223406, term223406.getClass(), "time", term223411);
        setField(term223390, term223390.getClass(), "registerTime", term223406);
        setIntField(term223417, term223417.getClass(), "year", 2025);
        setShortField(term223417, term223417.getClass(), "month", (short) 9);
        setShortField(term223417, term223417.getClass(), "day", (short) 18);
        setField(term223416, term223416.getClass(), "date", term223417);
        setByteField(term223421, term223421.getClass(), "hour", (byte) 13);
        setByteField(term223421, term223421.getClass(), "minute", (byte) 47);
        setByteField(term223421, term223421.getClass(), "second", (byte) 29);
        setIntField(term223421, term223421.getClass(), "nano", 832215473);
        setField(term223416, term223416.getClass(), "time", term223421);
        setField(term223390, term223390.getClass(), "accessTime", term223416);
        setField(term223388, term223388.getClass(), "card", term223390);
        setField(term223388, term223388.getClass(), "userName", "inMIkdHDqH");
        setIntField(term223388, term223388.getClass(), "isNetMember", 257279265);
        setIntField(term223388, term223388.getClass(), "iconId", -293267957);
        setIntField(term223388, term223388.getClass(), "plateId", -1966853151);
        setIntField(term223388, term223388.getClass(), "titleId", 1145144778);
        setIntField(term223388, term223388.getClass(), "partnerId", 1858161828);
        setIntField(term223388, term223388.getClass(), "frameId", 969920028);
        setIntField(term223388, term223388.getClass(), "selectMapId", -609652862);
        setIntField(term223388, term223388.getClass(), "totalAwake", -356838469);
        setIntField(term223388, term223388.getClass(), "gradeRating", -1696711810);
        setIntField(term223388, term223388.getClass(), "musicRating", -147714929);
        setIntField(term223388, term223388.getClass(), "playerRating", -2045202054);
        setIntField(term223388, term223388.getClass(), "highestRating", 1996188078);
        setIntField(term223388, term223388.getClass(), "gradeRank", -56413483);
        setIntField(term223388, term223388.getClass(), "classRank", -1181416306);
        setIntField(term223388, term223388.getClass(), "courseRank", 2099316913);
        setField(term223388, term223388.getClass(), "charaSlot", term223453);
        setField(term223388, term223388.getClass(), "charaLockSlot", term223469);
        setLongField(term223388, term223388.getClass(), "contentBit", -2636301423748481180L);
        setIntField(term223388, term223388.getClass(), "playCount", -992105490);
        setField(term223388, term223388.getClass(), "eventWatchedDate", "zynmdrdvrc");
        setField(term223388, term223388.getClass(), "lastGameId", "gqVrEwiTDp");
        setField(term223388, term223388.getClass(), "lastRomVersion", "qCXIpjQuAN");
        setField(term223388, term223388.getClass(), "lastDataVersion", "XtFDAFVYOy");
        setField(term223388, term223388.getClass(), "lastLoginDate", "lDtVJbLZPY");
        setField(term223388, term223388.getClass(), "lastPlayDate", "cirtQifnLU");
        setIntField(term223388, term223388.getClass(), "lastPlayCredit", -1449542606);
        setIntField(term223388, term223388.getClass(), "lastPlayMode", 406259462);
        setIntField(term223388, term223388.getClass(), "lastPlaceId", 660518206);
        setField(term223388, term223388.getClass(), "lastPlaceName", "AEGGKaZuJz");
        setIntField(term223388, term223388.getClass(), "lastAllNetId", -2010658317);
        setIntField(term223388, term223388.getClass(), "lastRegionId", -2061982603);
        setField(term223388, term223388.getClass(), "lastRegionName", "pXAYygCaFW");
        setField(term223388, term223388.getClass(), "lastClientId", "EVyNqsKIyD");
        setField(term223388, term223388.getClass(), "lastCountryCode", "hsfcBUrpFu");
        setIntField(term223388, term223388.getClass(), "lastSelectEMoney", -1288997751);
        setIntField(term223388, term223388.getClass(), "lastSelectTicket", -218628475);
        setIntField(term223388, term223388.getClass(), "lastSelectCourse", 704093413);
        setIntField(term223388, term223388.getClass(), "lastCountCourse", 718574088);
        setField(term223388, term223388.getClass(), "firstGameId", "BbyASkFeLz");
        setField(term223388, term223388.getClass(), "firstRomVersion", "LAPYhXgHLQ");
        setField(term223388, term223388.getClass(), "firstDataVersion", "pXJBBQWVOa");
        setField(term223388, term223388.getClass(), "firstPlayDate", "pshaxEXOYb");
        setField(term223388, term223388.getClass(), "compatibleCmVersion", "aoQRTwrWzK");
        setField(term223388, term223388.getClass(), "dailyBonusDate", "FFsMIgKWgX");
        setField(term223388, term223388.getClass(), "dailyCourseBonusDate", "DFdhwyqLGG");
        setField(term223388, term223388.getClass(), "lastPairLoginDate", "oQyjYOBmuq");
        setField(term223388, term223388.getClass(), "lastTrialPlayDate", "kBXuLNlNBw");
        setIntField(term223388, term223388.getClass(), "playVsCount", -1983026826);
        setIntField(term223388, term223388.getClass(), "playSyncCount", 340317830);
        setIntField(term223388, term223388.getClass(), "winCount", -1778062754);
        setIntField(term223388, term223388.getClass(), "helpCount", 656886359);
        setIntField(term223388, term223388.getClass(), "comboCount", -1737586602);
        setLongField(term223388, term223388.getClass(), "totalDeluxscore", -9207674693273072295L);
        setLongField(term223388, term223388.getClass(), "totalBasicDeluxscore", -6997182250345175814L);
        setLongField(term223388, term223388.getClass(), "totalAdvancedDeluxscore", -5162784231431459710L);
        setLongField(term223388, term223388.getClass(), "totalExpertDeluxscore", 5671578075099347901L);
        setLongField(term223388, term223388.getClass(), "totalMasterDeluxscore", -7286533343246428835L);
        setLongField(term223388, term223388.getClass(), "totalReMasterDeluxscore", -3527422387314975948L);
        setIntField(term223388, term223388.getClass(), "totalSync", -11215244);
        setIntField(term223388, term223388.getClass(), "totalBasicSync", -256225420);
        setIntField(term223388, term223388.getClass(), "totalAdvancedSync", 42031743);
        setIntField(term223388, term223388.getClass(), "totalExpertSync", 1933411977);
        setIntField(term223388, term223388.getClass(), "totalMasterSync", 1568448645);
        setIntField(term223388, term223388.getClass(), "totalReMasterSync", 784553974);
        setLongField(term223388, term223388.getClass(), "totalAchievement", -5958154304307155804L);
        setLongField(term223388, term223388.getClass(), "totalBasicAchievement", -7639412008388127098L);
        setLongField(term223388, term223388.getClass(), "totalAdvancedAchievement", 8969791860551454284L);
        setLongField(term223388, term223388.getClass(), "totalExpertAchievement", -6962561513576665540L);
        setLongField(term223388, term223388.getClass(), "totalMasterAchievement", 2886111967462612710L);
        setLongField(term223388, term223388.getClass(), "totalReMasterAchievement", -3824378508047410614L);
        setLongField(term223388, term223388.getClass(), "playerOldRating", 6309334620859649864L);
        setLongField(term223388, term223388.getClass(), "playerNewRating", 6918676465101434959L);
        setIntField(term223388, term223388.getClass(), "banState", -595519675);
        setLongField(term223388, term223388.getClass(), "dateTime", -6991127400049428884L);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.maimai2.model.userdata.UserDetail");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getLastTrialPlayDate", argTypes, term223388, args);
    }

};


