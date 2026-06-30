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

public class UserMusicDetail_setLevel_198555820114 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term63608;
     Object term63965;

    public UserMusicDetail_setLevel_198555820114() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Long term63614 = new Long(-1832940336320585644L);
        ArrayList term63675 = new ArrayList();
        Integer term63681 = new Integer(225873732);
        Integer term63683 = new Integer(529879356);
        Integer term63685 = new Integer(18072182);
        Integer term63687 = new Integer(1544768934);
        ArrayList term63679 = new ArrayList();
        ((ArrayList) term63679).add(term63681);
        ((ArrayList) term63679).add(term63683);
        ((ArrayList) term63679).add(term63685);
        ((ArrayList) term63679).add(term63687);
        term63608 = newInstance(Class.forName("icu.samnyan.aqua.sega.maimai2.model.userdata.UserMusicDetail"));
        Object term63610 = newInstance(Class.forName("icu.samnyan.aqua.sega.maimai2.model.userdata.UserDetail"));
        Object term63612 = newInstance(Class.forName("icu.samnyan.aqua.sega.general.model.Card"));
        Object term63628 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term63629 = newInstance(Class.forName("java.time.LocalDate"));
        Object term63633 = newInstance(Class.forName("java.time.LocalTime"));
        Object term63638 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term63639 = newInstance(Class.forName("java.time.LocalDate"));
        Object term63643 = newInstance(Class.forName("java.time.LocalTime"));
        setLongField(term63608, term63608.getClass(), "id", -3603009652560084801L);
        setLongField(term63610, term63610.getClass(), "id", -6386251470690822466L);
        setLongField(term63612, term63612.getClass(), "id", -8340412977479666356L);
        setField(term63612, term63612.getClass(), "extId", term63614);
        setField(term63612, term63612.getClass(), "luid", "PUPJWadLXP");
        setIntField(term63629, term63629.getClass(), "year", 2013);
        setShortField(term63629, term63629.getClass(), "month", (short) 1);
        setShortField(term63629, term63629.getClass(), "day", (short) 17);
        setField(term63628, term63628.getClass(), "date", term63629);
        setByteField(term63633, term63633.getClass(), "hour", (byte) 19);
        setByteField(term63633, term63633.getClass(), "minute", (byte) 49);
        setByteField(term63633, term63633.getClass(), "second", (byte) 53);
        setIntField(term63633, term63633.getClass(), "nano", 217542739);
        setField(term63628, term63628.getClass(), "time", term63633);
        setField(term63612, term63612.getClass(), "registerTime", term63628);
        setIntField(term63639, term63639.getClass(), "year", 2025);
        setShortField(term63639, term63639.getClass(), "month", (short) 8);
        setShortField(term63639, term63639.getClass(), "day", (short) 8);
        setField(term63638, term63638.getClass(), "date", term63639);
        setByteField(term63643, term63643.getClass(), "hour", (byte) 12);
        setByteField(term63643, term63643.getClass(), "minute", (byte) 29);
        setByteField(term63643, term63643.getClass(), "second", (byte) 36);
        setIntField(term63643, term63643.getClass(), "nano", 329488602);
        setField(term63638, term63638.getClass(), "time", term63643);
        setField(term63612, term63612.getClass(), "accessTime", term63638);
        setField(term63610, term63610.getClass(), "card", term63612);
        setField(term63610, term63610.getClass(), "userName", "TBNsemBBKA");
        setIntField(term63610, term63610.getClass(), "isNetMember", -80072701);
        setIntField(term63610, term63610.getClass(), "iconId", -224845635);
        setIntField(term63610, term63610.getClass(), "plateId", 115902179);
        setIntField(term63610, term63610.getClass(), "titleId", 930979700);
        setIntField(term63610, term63610.getClass(), "partnerId", 630565003);
        setIntField(term63610, term63610.getClass(), "frameId", -1966988507);
        setIntField(term63610, term63610.getClass(), "selectMapId", -1089838622);
        setIntField(term63610, term63610.getClass(), "totalAwake", -937178869);
        setIntField(term63610, term63610.getClass(), "gradeRating", -1952449836);
        setIntField(term63610, term63610.getClass(), "musicRating", -405260008);
        setIntField(term63610, term63610.getClass(), "playerRating", -468459707);
        setIntField(term63610, term63610.getClass(), "highestRating", -1652639905);
        setIntField(term63610, term63610.getClass(), "gradeRank", -1461889742);
        setIntField(term63610, term63610.getClass(), "classRank", 1948939030);
        setIntField(term63610, term63610.getClass(), "courseRank", -1707167847);
        setField(term63610, term63610.getClass(), "charaSlot", term63675);
        setField(term63610, term63610.getClass(), "charaLockSlot", term63679);
        setLongField(term63610, term63610.getClass(), "contentBit", 5072151233307900881L);
        setIntField(term63610, term63610.getClass(), "playCount", 1083097092);
        setField(term63610, term63610.getClass(), "eventWatchedDate", "DpNDxwXKkX");
        setField(term63610, term63610.getClass(), "lastGameId", "uxoFwkPfXf");
        setField(term63610, term63610.getClass(), "lastRomVersion", "OoVnZTvxUt");
        setField(term63610, term63610.getClass(), "lastDataVersion", "MnqnyndkhF");
        setField(term63610, term63610.getClass(), "lastLoginDate", "MZzoPKpFlh");
        setField(term63610, term63610.getClass(), "lastPlayDate", "skVZETaBKX");
        setIntField(term63610, term63610.getClass(), "lastPlayCredit", -352580386);
        setIntField(term63610, term63610.getClass(), "lastPlayMode", 1000158617);
        setIntField(term63610, term63610.getClass(), "lastPlaceId", 776700097);
        setField(term63610, term63610.getClass(), "lastPlaceName", "jcJNIBACPb");
        setIntField(term63610, term63610.getClass(), "lastAllNetId", -147634418);
        setIntField(term63610, term63610.getClass(), "lastRegionId", 1734729002);
        setField(term63610, term63610.getClass(), "lastRegionName", "mPQmjoknqi");
        setField(term63610, term63610.getClass(), "lastClientId", "gLgvePQRQT");
        setField(term63610, term63610.getClass(), "lastCountryCode", "SCmsfHIEPK");
        setIntField(term63610, term63610.getClass(), "lastSelectEMoney", 356178482);
        setIntField(term63610, term63610.getClass(), "lastSelectTicket", 2114777679);
        setIntField(term63610, term63610.getClass(), "lastSelectCourse", 877149909);
        setIntField(term63610, term63610.getClass(), "lastCountCourse", -649501188);
        setField(term63610, term63610.getClass(), "firstGameId", "dFOuezLNWb");
        setField(term63610, term63610.getClass(), "firstRomVersion", "PUWJnLuyiR");
        setField(term63610, term63610.getClass(), "firstDataVersion", "ADhJCRgHaS");
        setField(term63610, term63610.getClass(), "firstPlayDate", "qociGUMzem");
        setField(term63610, term63610.getClass(), "compatibleCmVersion", "HHAfSjIdNi");
        setField(term63610, term63610.getClass(), "dailyBonusDate", "oTqQEKklHi");
        setField(term63610, term63610.getClass(), "dailyCourseBonusDate", "riyKkxMvWm");
        setField(term63610, term63610.getClass(), "lastPairLoginDate", "WENnGcBSTd");
        setField(term63610, term63610.getClass(), "lastTrialPlayDate", "juEYcOCxLW");
        setIntField(term63610, term63610.getClass(), "playVsCount", 2143993585);
        setIntField(term63610, term63610.getClass(), "playSyncCount", -2067989740);
        setIntField(term63610, term63610.getClass(), "winCount", 229990395);
        setIntField(term63610, term63610.getClass(), "helpCount", -1374118535);
        setIntField(term63610, term63610.getClass(), "comboCount", 2009032714);
        setLongField(term63610, term63610.getClass(), "totalDeluxscore", 2250556415549346949L);
        setLongField(term63610, term63610.getClass(), "totalBasicDeluxscore", -4674840583005034118L);
        setLongField(term63610, term63610.getClass(), "totalAdvancedDeluxscore", 3952299423271006072L);
        setLongField(term63610, term63610.getClass(), "totalExpertDeluxscore", 6681879584837155391L);
        setLongField(term63610, term63610.getClass(), "totalMasterDeluxscore", 5457987117152229930L);
        setLongField(term63610, term63610.getClass(), "totalReMasterDeluxscore", -4303254485153363630L);
        setIntField(term63610, term63610.getClass(), "totalSync", -1630891015);
        setIntField(term63610, term63610.getClass(), "totalBasicSync", 904551854);
        setIntField(term63610, term63610.getClass(), "totalAdvancedSync", -49272576);
        setIntField(term63610, term63610.getClass(), "totalExpertSync", 246585268);
        setIntField(term63610, term63610.getClass(), "totalMasterSync", 1163312144);
        setIntField(term63610, term63610.getClass(), "totalReMasterSync", 1010014762);
        setLongField(term63610, term63610.getClass(), "totalAchievement", -6459891615024824682L);
        setLongField(term63610, term63610.getClass(), "totalBasicAchievement", 4404944231648782138L);
        setLongField(term63610, term63610.getClass(), "totalAdvancedAchievement", -7960465355740029962L);
        setLongField(term63610, term63610.getClass(), "totalExpertAchievement", -7641504744663354190L);
        setLongField(term63610, term63610.getClass(), "totalMasterAchievement", 2973367088695686720L);
        setLongField(term63610, term63610.getClass(), "totalReMasterAchievement", 3957586217570224080L);
        setLongField(term63610, term63610.getClass(), "playerOldRating", 8593688994010397171L);
        setLongField(term63610, term63610.getClass(), "playerNewRating", -4702186846634836119L);
        setIntField(term63610, term63610.getClass(), "banState", -416886439);
        setLongField(term63610, term63610.getClass(), "dateTime", -8068180925713934318L);
        setField(term63608, term63608.getClass(), "user", term63610);
        setIntField(term63608, term63608.getClass(), "musicId", -1632599980);
        setIntField(term63608, term63608.getClass(), "level", -445306395);
        setIntField(term63608, term63608.getClass(), "playCount", -1543037055);
        setIntField(term63608, term63608.getClass(), "achievement", -150763986);
        setIntField(term63608, term63608.getClass(), "comboStatus", 1946252506);
        setIntField(term63608, term63608.getClass(), "syncStatus", -1279902182);
        setIntField(term63608, term63608.getClass(), "deluxscoreMax", -551427938);
        setIntField(term63608, term63608.getClass(), "scoreRank", 1334551737);
        term63965 = new Integer(-1187792021);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.maimai2.model.userdata.UserMusicDetail");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = int.class;
        Object[] args = new Object[1];
        args[0] = term63965;
        callMethod(klass, "setLevel", argTypes, term63608, args);
    }

};


