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

public class UserDetail_getLastAllNetId_37588613332 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term213686;

    public UserDetail_getLastAllNetId_37588613332() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Long term213690 = new Long(-2691996476200751382L);
        Integer term213753 = new Integer(-2011847985);
        Integer term213755 = new Integer(1113480119);
        Integer term213757 = new Integer(-159235116);
        Integer term213759 = new Integer(1280384723);
        Integer term213761 = new Integer(1755299610);
        Integer term213763 = new Integer(1141997389);
        Integer term213765 = new Integer(-1491507262);
        ArrayList term213751 = new ArrayList();
        ((ArrayList) term213751).add(term213753);
        ((ArrayList) term213751).add(term213755);
        ((ArrayList) term213751).add(term213757);
        ((ArrayList) term213751).add(term213759);
        ((ArrayList) term213751).add(term213761);
        ((ArrayList) term213751).add(term213763);
        ((ArrayList) term213751).add(term213765);
        ArrayList term213769 = new ArrayList();
        term213686 = newInstance(Class.forName("icu.samnyan.aqua.sega.maimai2.model.userdata.UserDetail"));
        Object term213688 = newInstance(Class.forName("icu.samnyan.aqua.sega.general.model.Card"));
        Object term213704 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term213705 = newInstance(Class.forName("java.time.LocalDate"));
        Object term213709 = newInstance(Class.forName("java.time.LocalTime"));
        Object term213714 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term213715 = newInstance(Class.forName("java.time.LocalDate"));
        Object term213719 = newInstance(Class.forName("java.time.LocalTime"));
        setLongField(term213686, term213686.getClass(), "id", 4064024558032123978L);
        setLongField(term213688, term213688.getClass(), "id", 7145794412304624733L);
        setField(term213688, term213688.getClass(), "extId", term213690);
        setField(term213688, term213688.getClass(), "luid", "yBWLVacoFx");
        setIntField(term213705, term213705.getClass(), "year", 2010);
        setShortField(term213705, term213705.getClass(), "month", (short) 5);
        setShortField(term213705, term213705.getClass(), "day", (short) 27);
        setField(term213704, term213704.getClass(), "date", term213705);
        setByteField(term213709, term213709.getClass(), "hour", (byte) 20);
        setByteField(term213709, term213709.getClass(), "minute", (byte) 55);
        setByteField(term213709, term213709.getClass(), "second", (byte) 13);
        setIntField(term213709, term213709.getClass(), "nano", 375773979);
        setField(term213704, term213704.getClass(), "time", term213709);
        setField(term213688, term213688.getClass(), "registerTime", term213704);
        setIntField(term213715, term213715.getClass(), "year", 2023);
        setShortField(term213715, term213715.getClass(), "month", (short) 5);
        setShortField(term213715, term213715.getClass(), "day", (short) 21);
        setField(term213714, term213714.getClass(), "date", term213715);
        setByteField(term213719, term213719.getClass(), "hour", (byte) 7);
        setByteField(term213719, term213719.getClass(), "minute", (byte) 54);
        setByteField(term213719, term213719.getClass(), "second", (byte) 55);
        setIntField(term213719, term213719.getClass(), "nano", 241590130);
        setField(term213714, term213714.getClass(), "time", term213719);
        setField(term213688, term213688.getClass(), "accessTime", term213714);
        setField(term213686, term213686.getClass(), "card", term213688);
        setField(term213686, term213686.getClass(), "userName", "dHSfngZIJP");
        setIntField(term213686, term213686.getClass(), "isNetMember", 578922091);
        setIntField(term213686, term213686.getClass(), "iconId", 1645299882);
        setIntField(term213686, term213686.getClass(), "plateId", -430972061);
        setIntField(term213686, term213686.getClass(), "titleId", 303799281);
        setIntField(term213686, term213686.getClass(), "partnerId", 993949631);
        setIntField(term213686, term213686.getClass(), "frameId", -1501399057);
        setIntField(term213686, term213686.getClass(), "selectMapId", 1885755605);
        setIntField(term213686, term213686.getClass(), "totalAwake", -865640007);
        setIntField(term213686, term213686.getClass(), "gradeRating", -852853895);
        setIntField(term213686, term213686.getClass(), "musicRating", 923992540);
        setIntField(term213686, term213686.getClass(), "playerRating", -1752952689);
        setIntField(term213686, term213686.getClass(), "highestRating", -1876841878);
        setIntField(term213686, term213686.getClass(), "gradeRank", -314514599);
        setIntField(term213686, term213686.getClass(), "classRank", 913233303);
        setIntField(term213686, term213686.getClass(), "courseRank", -1757188792);
        setField(term213686, term213686.getClass(), "charaSlot", term213751);
        setField(term213686, term213686.getClass(), "charaLockSlot", term213769);
        setLongField(term213686, term213686.getClass(), "contentBit", 2829552823682090996L);
        setIntField(term213686, term213686.getClass(), "playCount", 988441469);
        setField(term213686, term213686.getClass(), "eventWatchedDate", "CJAtcuTGHa");
        setField(term213686, term213686.getClass(), "lastGameId", "iHNeGutoBe");
        setField(term213686, term213686.getClass(), "lastRomVersion", "AUYkRCDvFL");
        setField(term213686, term213686.getClass(), "lastDataVersion", "kkEjADnYLO");
        setField(term213686, term213686.getClass(), "lastLoginDate", "TsbsGtwNGu");
        setField(term213686, term213686.getClass(), "lastPlayDate", "QwHuOwnkhN");
        setIntField(term213686, term213686.getClass(), "lastPlayCredit", -152256749);
        setIntField(term213686, term213686.getClass(), "lastPlayMode", -218639168);
        setIntField(term213686, term213686.getClass(), "lastPlaceId", -429628062);
        setField(term213686, term213686.getClass(), "lastPlaceName", "VPnzlRjkwv");
        setIntField(term213686, term213686.getClass(), "lastAllNetId", 473106716);
        setIntField(term213686, term213686.getClass(), "lastRegionId", -434143406);
        setField(term213686, term213686.getClass(), "lastRegionName", "kGHPIwWRWu");
        setField(term213686, term213686.getClass(), "lastClientId", "IJsNSqAFmS");
        setField(term213686, term213686.getClass(), "lastCountryCode", "RpuVDFROhs");
        setIntField(term213686, term213686.getClass(), "lastSelectEMoney", -1144966099);
        setIntField(term213686, term213686.getClass(), "lastSelectTicket", -56203372);
        setIntField(term213686, term213686.getClass(), "lastSelectCourse", -174061580);
        setIntField(term213686, term213686.getClass(), "lastCountCourse", 236856575);
        setField(term213686, term213686.getClass(), "firstGameId", "quAdPAVxpb");
        setField(term213686, term213686.getClass(), "firstRomVersion", "SHPiFSZxaM");
        setField(term213686, term213686.getClass(), "firstDataVersion", "MGNQzfluos");
        setField(term213686, term213686.getClass(), "firstPlayDate", "bEqBGVftHS");
        setField(term213686, term213686.getClass(), "compatibleCmVersion", "TeNUwFQFbf");
        setField(term213686, term213686.getClass(), "dailyBonusDate", "AxcRekxBDy");
        setField(term213686, term213686.getClass(), "dailyCourseBonusDate", "PJgWnydUjb");
        setField(term213686, term213686.getClass(), "lastPairLoginDate", "JLLHHjJqxd");
        setField(term213686, term213686.getClass(), "lastTrialPlayDate", "xLCbBvSbQG");
        setIntField(term213686, term213686.getClass(), "playVsCount", -1726762020);
        setIntField(term213686, term213686.getClass(), "playSyncCount", -632724023);
        setIntField(term213686, term213686.getClass(), "winCount", 1593018448);
        setIntField(term213686, term213686.getClass(), "helpCount", 492544194);
        setIntField(term213686, term213686.getClass(), "comboCount", -1477909979);
        setLongField(term213686, term213686.getClass(), "totalDeluxscore", -5015750737482175704L);
        setLongField(term213686, term213686.getClass(), "totalBasicDeluxscore", -1437774821727356513L);
        setLongField(term213686, term213686.getClass(), "totalAdvancedDeluxscore", -7595484344988141936L);
        setLongField(term213686, term213686.getClass(), "totalExpertDeluxscore", 6589159223353954342L);
        setLongField(term213686, term213686.getClass(), "totalMasterDeluxscore", -7368973459338784672L);
        setLongField(term213686, term213686.getClass(), "totalReMasterDeluxscore", -7976516290695169572L);
        setIntField(term213686, term213686.getClass(), "totalSync", -975558073);
        setIntField(term213686, term213686.getClass(), "totalBasicSync", -541335965);
        setIntField(term213686, term213686.getClass(), "totalAdvancedSync", 790308552);
        setIntField(term213686, term213686.getClass(), "totalExpertSync", -1543840209);
        setIntField(term213686, term213686.getClass(), "totalMasterSync", 411851539);
        setIntField(term213686, term213686.getClass(), "totalReMasterSync", -1461527580);
        setLongField(term213686, term213686.getClass(), "totalAchievement", -3472611771220786891L);
        setLongField(term213686, term213686.getClass(), "totalBasicAchievement", -5245156700761266221L);
        setLongField(term213686, term213686.getClass(), "totalAdvancedAchievement", -3660699514135311515L);
        setLongField(term213686, term213686.getClass(), "totalExpertAchievement", -1788657828389907109L);
        setLongField(term213686, term213686.getClass(), "totalMasterAchievement", -1012039825774548964L);
        setLongField(term213686, term213686.getClass(), "totalReMasterAchievement", 2413946911910708169L);
        setLongField(term213686, term213686.getClass(), "playerOldRating", -4354064902026120504L);
        setLongField(term213686, term213686.getClass(), "playerNewRating", 7572847841780625017L);
        setIntField(term213686, term213686.getClass(), "banState", -1241679161);
        setLongField(term213686, term213686.getClass(), "dateTime", -4659933601651349834L);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.maimai2.model.userdata.UserDetail");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getLastAllNetId", argTypes, term213686, args);
    }

};


