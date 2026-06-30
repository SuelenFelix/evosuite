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

public class UserDetail_setGradeRating_143799832089 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term245461;
     Object term245814;

    public UserDetail_setGradeRating_143799832089() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Long term245465 = new Long(7711054832353934171L);
        Integer term245528 = new Integer(-1618606893);
        Integer term245530 = new Integer(-560211840);
        Integer term245532 = new Integer(103542361);
        Integer term245534 = new Integer(-1737221099);
        Integer term245536 = new Integer(-1032313881);
        Integer term245538 = new Integer(1246554458);
        ArrayList term245526 = new ArrayList();
        ((ArrayList) term245526).add(term245528);
        ((ArrayList) term245526).add(term245530);
        ((ArrayList) term245526).add(term245532);
        ((ArrayList) term245526).add(term245534);
        ((ArrayList) term245526).add(term245536);
        ((ArrayList) term245526).add(term245538);
        Integer term245544 = new Integer(-1913837862);
        ArrayList term245542 = new ArrayList();
        ((ArrayList) term245542).add(term245544);
        term245461 = newInstance(Class.forName("icu.samnyan.aqua.sega.maimai2.model.userdata.UserDetail"));
        Object term245463 = newInstance(Class.forName("icu.samnyan.aqua.sega.general.model.Card"));
        Object term245479 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term245480 = newInstance(Class.forName("java.time.LocalDate"));
        Object term245484 = newInstance(Class.forName("java.time.LocalTime"));
        Object term245489 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term245490 = newInstance(Class.forName("java.time.LocalDate"));
        Object term245494 = newInstance(Class.forName("java.time.LocalTime"));
        setLongField(term245461, term245461.getClass(), "id", 6258088989451208329L);
        setLongField(term245463, term245463.getClass(), "id", -4993325194615343376L);
        setField(term245463, term245463.getClass(), "extId", term245465);
        setField(term245463, term245463.getClass(), "luid", "UQFCGhBwRP");
        setIntField(term245480, term245480.getClass(), "year", 2010);
        setShortField(term245480, term245480.getClass(), "month", (short) 2);
        setShortField(term245480, term245480.getClass(), "day", (short) 11);
        setField(term245479, term245479.getClass(), "date", term245480);
        setByteField(term245484, term245484.getClass(), "hour", (byte) 12);
        setByteField(term245484, term245484.getClass(), "minute", (byte) 49);
        setByteField(term245484, term245484.getClass(), "second", (byte) 35);
        setIntField(term245484, term245484.getClass(), "nano", 685384504);
        setField(term245479, term245479.getClass(), "time", term245484);
        setField(term245463, term245463.getClass(), "registerTime", term245479);
        setIntField(term245490, term245490.getClass(), "year", 2024);
        setShortField(term245490, term245490.getClass(), "month", (short) 8);
        setShortField(term245490, term245490.getClass(), "day", (short) 7);
        setField(term245489, term245489.getClass(), "date", term245490);
        setByteField(term245494, term245494.getClass(), "hour", (byte) 8);
        setByteField(term245494, term245494.getClass(), "minute", (byte) 41);
        setByteField(term245494, term245494.getClass(), "second", (byte) 36);
        setIntField(term245494, term245494.getClass(), "nano", 84091386);
        setField(term245489, term245489.getClass(), "time", term245494);
        setField(term245463, term245463.getClass(), "accessTime", term245489);
        setField(term245461, term245461.getClass(), "card", term245463);
        setField(term245461, term245461.getClass(), "userName", "IKUCiyluwb");
        setIntField(term245461, term245461.getClass(), "isNetMember", -609562912);
        setIntField(term245461, term245461.getClass(), "iconId", -1417204225);
        setIntField(term245461, term245461.getClass(), "plateId", 1033124516);
        setIntField(term245461, term245461.getClass(), "titleId", -2034452011);
        setIntField(term245461, term245461.getClass(), "partnerId", 83285907);
        setIntField(term245461, term245461.getClass(), "frameId", 137869647);
        setIntField(term245461, term245461.getClass(), "selectMapId", -641148370);
        setIntField(term245461, term245461.getClass(), "totalAwake", 2003661423);
        setIntField(term245461, term245461.getClass(), "gradeRating", 870043783);
        setIntField(term245461, term245461.getClass(), "musicRating", 643945557);
        setIntField(term245461, term245461.getClass(), "playerRating", 276441632);
        setIntField(term245461, term245461.getClass(), "highestRating", -556077472);
        setIntField(term245461, term245461.getClass(), "gradeRank", 1592695310);
        setIntField(term245461, term245461.getClass(), "classRank", -728764834);
        setIntField(term245461, term245461.getClass(), "courseRank", -992158957);
        setField(term245461, term245461.getClass(), "charaSlot", term245526);
        setField(term245461, term245461.getClass(), "charaLockSlot", term245542);
        setLongField(term245461, term245461.getClass(), "contentBit", 60920379124929106L);
        setIntField(term245461, term245461.getClass(), "playCount", 1638488155);
        setField(term245461, term245461.getClass(), "eventWatchedDate", "OIVvPvythq");
        setField(term245461, term245461.getClass(), "lastGameId", "OIRXQPPjVx");
        setField(term245461, term245461.getClass(), "lastRomVersion", "SxVFmiOidb");
        setField(term245461, term245461.getClass(), "lastDataVersion", "BsiZGiodQR");
        setField(term245461, term245461.getClass(), "lastLoginDate", "oJyzXrwmfx");
        setField(term245461, term245461.getClass(), "lastPlayDate", "RsEXdKLcXN");
        setIntField(term245461, term245461.getClass(), "lastPlayCredit", -1011938930);
        setIntField(term245461, term245461.getClass(), "lastPlayMode", -374210090);
        setIntField(term245461, term245461.getClass(), "lastPlaceId", 1118760300);
        setField(term245461, term245461.getClass(), "lastPlaceName", "zoOFEvSdRU");
        setIntField(term245461, term245461.getClass(), "lastAllNetId", 843719523);
        setIntField(term245461, term245461.getClass(), "lastRegionId", -815481212);
        setField(term245461, term245461.getClass(), "lastRegionName", "WtywQPTOaF");
        setField(term245461, term245461.getClass(), "lastClientId", "MZMkZoDeKG");
        setField(term245461, term245461.getClass(), "lastCountryCode", "JWhhCdUerg");
        setIntField(term245461, term245461.getClass(), "lastSelectEMoney", -1439310082);
        setIntField(term245461, term245461.getClass(), "lastSelectTicket", 312293379);
        setIntField(term245461, term245461.getClass(), "lastSelectCourse", 241022625);
        setIntField(term245461, term245461.getClass(), "lastCountCourse", 25543628);
        setField(term245461, term245461.getClass(), "firstGameId", "DrlBWOScgm");
        setField(term245461, term245461.getClass(), "firstRomVersion", "dOAfAvZzvo");
        setField(term245461, term245461.getClass(), "firstDataVersion", "FEfDieFUtF");
        setField(term245461, term245461.getClass(), "firstPlayDate", "OvdIsypBPN");
        setField(term245461, term245461.getClass(), "compatibleCmVersion", "NJNxLsnXOW");
        setField(term245461, term245461.getClass(), "dailyBonusDate", "GwcBHiivYy");
        setField(term245461, term245461.getClass(), "dailyCourseBonusDate", "ABHmWCUreJ");
        setField(term245461, term245461.getClass(), "lastPairLoginDate", "uvkCPATnTh");
        setField(term245461, term245461.getClass(), "lastTrialPlayDate", "ZggbZCwwZM");
        setIntField(term245461, term245461.getClass(), "playVsCount", 88927707);
        setIntField(term245461, term245461.getClass(), "playSyncCount", 573060356);
        setIntField(term245461, term245461.getClass(), "winCount", 1701020279);
        setIntField(term245461, term245461.getClass(), "helpCount", 1578074399);
        setIntField(term245461, term245461.getClass(), "comboCount", 1266129777);
        setLongField(term245461, term245461.getClass(), "totalDeluxscore", 144651909277527635L);
        setLongField(term245461, term245461.getClass(), "totalBasicDeluxscore", 1342009833658976057L);
        setLongField(term245461, term245461.getClass(), "totalAdvancedDeluxscore", -6603952203904631941L);
        setLongField(term245461, term245461.getClass(), "totalExpertDeluxscore", -6759487886069093698L);
        setLongField(term245461, term245461.getClass(), "totalMasterDeluxscore", 5476845655483774178L);
        setLongField(term245461, term245461.getClass(), "totalReMasterDeluxscore", 1064924295514704385L);
        setIntField(term245461, term245461.getClass(), "totalSync", -2062665446);
        setIntField(term245461, term245461.getClass(), "totalBasicSync", 766366420);
        setIntField(term245461, term245461.getClass(), "totalAdvancedSync", -440483620);
        setIntField(term245461, term245461.getClass(), "totalExpertSync", -63052239);
        setIntField(term245461, term245461.getClass(), "totalMasterSync", -302024503);
        setIntField(term245461, term245461.getClass(), "totalReMasterSync", -1240468791);
        setLongField(term245461, term245461.getClass(), "totalAchievement", -8214081883287786854L);
        setLongField(term245461, term245461.getClass(), "totalBasicAchievement", 7232800302054977343L);
        setLongField(term245461, term245461.getClass(), "totalAdvancedAchievement", -5032863289051512463L);
        setLongField(term245461, term245461.getClass(), "totalExpertAchievement", -5346594643757814884L);
        setLongField(term245461, term245461.getClass(), "totalMasterAchievement", -4048029769311364016L);
        setLongField(term245461, term245461.getClass(), "totalReMasterAchievement", -410800111156348638L);
        setLongField(term245461, term245461.getClass(), "playerOldRating", 2498023275613583331L);
        setLongField(term245461, term245461.getClass(), "playerNewRating", 2976412438547970313L);
        setIntField(term245461, term245461.getClass(), "banState", 1973145098);
        setLongField(term245461, term245461.getClass(), "dateTime", -6837683800645116802L);
        term245814 = new Integer(-75514449);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.maimai2.model.userdata.UserDetail");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = int.class;
        Object[] args = new Object[1];
        args[0] = term245814;
        callMethod(klass, "setGradeRating", argTypes, term245461, args);
    }

};


