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

public class UserDetail_getLastTrialPlayDate_35657429749 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term223333;

    public UserDetail_getLastTrialPlayDate_35657429749() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Long term223337 = new Long(-421166328269063791L);
        Integer term223400 = new Integer(692290973);
        Integer term223402 = new Integer(344667712);
        Integer term223404 = new Integer(921447346);
        Integer term223406 = new Integer(1514227664);
        Integer term223408 = new Integer(2000874140);
        Integer term223410 = new Integer(-701728269);
        ArrayList term223398 = new ArrayList();
        ((ArrayList) term223398).add(term223400);
        ((ArrayList) term223398).add(term223402);
        ((ArrayList) term223398).add(term223404);
        ((ArrayList) term223398).add(term223406);
        ((ArrayList) term223398).add(term223408);
        ((ArrayList) term223398).add(term223410);
        Integer term223416 = new Integer(-1094813190);
        Integer term223418 = new Integer(-355401879);
        Integer term223420 = new Integer(-1878519758);
        ArrayList term223414 = new ArrayList();
        ((ArrayList) term223414).add(term223416);
        ((ArrayList) term223414).add(term223418);
        ((ArrayList) term223414).add(term223420);
        term223333 = newInstance(Class.forName("icu.samnyan.aqua.sega.maimai2.model.userdata.UserDetail"));
        Object term223335 = newInstance(Class.forName("icu.samnyan.aqua.sega.general.model.Card"));
        Object term223351 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term223352 = newInstance(Class.forName("java.time.LocalDate"));
        Object term223356 = newInstance(Class.forName("java.time.LocalTime"));
        Object term223361 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term223362 = newInstance(Class.forName("java.time.LocalDate"));
        Object term223366 = newInstance(Class.forName("java.time.LocalTime"));
        setLongField(term223333, term223333.getClass(), "id", 1918233396303860114L);
        setLongField(term223335, term223335.getClass(), "id", -8697608146515998914L);
        setField(term223335, term223335.getClass(), "extId", term223337);
        setField(term223335, term223335.getClass(), "luid", "dNnvcFIEqu");
        setIntField(term223352, term223352.getClass(), "year", 2028);
        setShortField(term223352, term223352.getClass(), "month", (short) 3);
        setShortField(term223352, term223352.getClass(), "day", (short) 23);
        setField(term223351, term223351.getClass(), "date", term223352);
        setByteField(term223356, term223356.getClass(), "hour", (byte) 18);
        setByteField(term223356, term223356.getClass(), "minute", (byte) 27);
        setByteField(term223356, term223356.getClass(), "second", (byte) 54);
        setIntField(term223356, term223356.getClass(), "nano", 421491474);
        setField(term223351, term223351.getClass(), "time", term223356);
        setField(term223335, term223335.getClass(), "registerTime", term223351);
        setIntField(term223362, term223362.getClass(), "year", 2025);
        setShortField(term223362, term223362.getClass(), "month", (short) 9);
        setShortField(term223362, term223362.getClass(), "day", (short) 18);
        setField(term223361, term223361.getClass(), "date", term223362);
        setByteField(term223366, term223366.getClass(), "hour", (byte) 13);
        setByteField(term223366, term223366.getClass(), "minute", (byte) 47);
        setByteField(term223366, term223366.getClass(), "second", (byte) 29);
        setIntField(term223366, term223366.getClass(), "nano", 832215473);
        setField(term223361, term223361.getClass(), "time", term223366);
        setField(term223335, term223335.getClass(), "accessTime", term223361);
        setField(term223333, term223333.getClass(), "card", term223335);
        setField(term223333, term223333.getClass(), "userName", "inMIkdHDqH");
        setIntField(term223333, term223333.getClass(), "isNetMember", 257279265);
        setIntField(term223333, term223333.getClass(), "iconId", -293267957);
        setIntField(term223333, term223333.getClass(), "plateId", -1966853151);
        setIntField(term223333, term223333.getClass(), "titleId", 1145144778);
        setIntField(term223333, term223333.getClass(), "partnerId", 1858161828);
        setIntField(term223333, term223333.getClass(), "frameId", 969920028);
        setIntField(term223333, term223333.getClass(), "selectMapId", -609652862);
        setIntField(term223333, term223333.getClass(), "totalAwake", -356838469);
        setIntField(term223333, term223333.getClass(), "gradeRating", -1696711810);
        setIntField(term223333, term223333.getClass(), "musicRating", -147714929);
        setIntField(term223333, term223333.getClass(), "playerRating", -2045202054);
        setIntField(term223333, term223333.getClass(), "highestRating", 1996188078);
        setIntField(term223333, term223333.getClass(), "gradeRank", -56413483);
        setIntField(term223333, term223333.getClass(), "classRank", -1181416306);
        setIntField(term223333, term223333.getClass(), "courseRank", 2099316913);
        setField(term223333, term223333.getClass(), "charaSlot", term223398);
        setField(term223333, term223333.getClass(), "charaLockSlot", term223414);
        setLongField(term223333, term223333.getClass(), "contentBit", -2636301423748481180L);
        setIntField(term223333, term223333.getClass(), "playCount", -992105490);
        setField(term223333, term223333.getClass(), "eventWatchedDate", "zynmdrdvrc");
        setField(term223333, term223333.getClass(), "lastGameId", "gqVrEwiTDp");
        setField(term223333, term223333.getClass(), "lastRomVersion", "qCXIpjQuAN");
        setField(term223333, term223333.getClass(), "lastDataVersion", "XtFDAFVYOy");
        setField(term223333, term223333.getClass(), "lastLoginDate", "lDtVJbLZPY");
        setField(term223333, term223333.getClass(), "lastPlayDate", "cirtQifnLU");
        setIntField(term223333, term223333.getClass(), "lastPlayCredit", -1449542606);
        setIntField(term223333, term223333.getClass(), "lastPlayMode", 406259462);
        setIntField(term223333, term223333.getClass(), "lastPlaceId", 660518206);
        setField(term223333, term223333.getClass(), "lastPlaceName", "AEGGKaZuJz");
        setIntField(term223333, term223333.getClass(), "lastAllNetId", -2010658317);
        setIntField(term223333, term223333.getClass(), "lastRegionId", -2061982603);
        setField(term223333, term223333.getClass(), "lastRegionName", "pXAYygCaFW");
        setField(term223333, term223333.getClass(), "lastClientId", "EVyNqsKIyD");
        setField(term223333, term223333.getClass(), "lastCountryCode", "hsfcBUrpFu");
        setIntField(term223333, term223333.getClass(), "lastSelectEMoney", -1288997751);
        setIntField(term223333, term223333.getClass(), "lastSelectTicket", -218628475);
        setIntField(term223333, term223333.getClass(), "lastSelectCourse", 704093413);
        setIntField(term223333, term223333.getClass(), "lastCountCourse", 718574088);
        setField(term223333, term223333.getClass(), "firstGameId", "BbyASkFeLz");
        setField(term223333, term223333.getClass(), "firstRomVersion", "LAPYhXgHLQ");
        setField(term223333, term223333.getClass(), "firstDataVersion", "pXJBBQWVOa");
        setField(term223333, term223333.getClass(), "firstPlayDate", "pshaxEXOYb");
        setField(term223333, term223333.getClass(), "compatibleCmVersion", "aoQRTwrWzK");
        setField(term223333, term223333.getClass(), "dailyBonusDate", "FFsMIgKWgX");
        setField(term223333, term223333.getClass(), "dailyCourseBonusDate", "DFdhwyqLGG");
        setField(term223333, term223333.getClass(), "lastPairLoginDate", "oQyjYOBmuq");
        setField(term223333, term223333.getClass(), "lastTrialPlayDate", "kBXuLNlNBw");
        setIntField(term223333, term223333.getClass(), "playVsCount", -1983026826);
        setIntField(term223333, term223333.getClass(), "playSyncCount", 340317830);
        setIntField(term223333, term223333.getClass(), "winCount", -1778062754);
        setIntField(term223333, term223333.getClass(), "helpCount", 656886359);
        setIntField(term223333, term223333.getClass(), "comboCount", -1737586602);
        setLongField(term223333, term223333.getClass(), "totalDeluxscore", -9207674693273072295L);
        setLongField(term223333, term223333.getClass(), "totalBasicDeluxscore", -6997182250345175814L);
        setLongField(term223333, term223333.getClass(), "totalAdvancedDeluxscore", -5162784231431459710L);
        setLongField(term223333, term223333.getClass(), "totalExpertDeluxscore", 5671578075099347901L);
        setLongField(term223333, term223333.getClass(), "totalMasterDeluxscore", -7286533343246428835L);
        setLongField(term223333, term223333.getClass(), "totalReMasterDeluxscore", -3527422387314975948L);
        setIntField(term223333, term223333.getClass(), "totalSync", -11215244);
        setIntField(term223333, term223333.getClass(), "totalBasicSync", -256225420);
        setIntField(term223333, term223333.getClass(), "totalAdvancedSync", 42031743);
        setIntField(term223333, term223333.getClass(), "totalExpertSync", 1933411977);
        setIntField(term223333, term223333.getClass(), "totalMasterSync", 1568448645);
        setIntField(term223333, term223333.getClass(), "totalReMasterSync", 784553974);
        setLongField(term223333, term223333.getClass(), "totalAchievement", -5958154304307155804L);
        setLongField(term223333, term223333.getClass(), "totalBasicAchievement", -7639412008388127098L);
        setLongField(term223333, term223333.getClass(), "totalAdvancedAchievement", 8969791860551454284L);
        setLongField(term223333, term223333.getClass(), "totalExpertAchievement", -6962561513576665540L);
        setLongField(term223333, term223333.getClass(), "totalMasterAchievement", 2886111967462612710L);
        setLongField(term223333, term223333.getClass(), "totalReMasterAchievement", -3824378508047410614L);
        setLongField(term223333, term223333.getClass(), "playerOldRating", 6309334620859649864L);
        setLongField(term223333, term223333.getClass(), "playerNewRating", 6918676465101434959L);
        setIntField(term223333, term223333.getClass(), "banState", -595519675);
        setLongField(term223333, term223333.getClass(), "dateTime", -6991127400049428884L);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.maimai2.model.userdata.UserDetail");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getLastTrialPlayDate", argTypes, term223333, args);
    }

};


