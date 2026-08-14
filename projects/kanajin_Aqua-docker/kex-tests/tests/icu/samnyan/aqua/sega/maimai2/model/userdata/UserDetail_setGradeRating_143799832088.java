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

public class UserDetail_setGradeRating_143799832088 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term245406;
     Object term245759;

    public UserDetail_setGradeRating_143799832088() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Long term245410 = new Long(7711054832353934171L);
        Integer term245473 = new Integer(-1618606893);
        Integer term245475 = new Integer(-560211840);
        Integer term245477 = new Integer(103542361);
        Integer term245479 = new Integer(-1737221099);
        Integer term245481 = new Integer(-1032313881);
        Integer term245483 = new Integer(1246554458);
        ArrayList term245471 = new ArrayList();
        ((ArrayList) term245471).add(term245473);
        ((ArrayList) term245471).add(term245475);
        ((ArrayList) term245471).add(term245477);
        ((ArrayList) term245471).add(term245479);
        ((ArrayList) term245471).add(term245481);
        ((ArrayList) term245471).add(term245483);
        Integer term245489 = new Integer(-1913837862);
        ArrayList term245487 = new ArrayList();
        ((ArrayList) term245487).add(term245489);
        term245406 = newInstance(Class.forName("icu.samnyan.aqua.sega.maimai2.model.userdata.UserDetail"));
        Object term245408 = newInstance(Class.forName("icu.samnyan.aqua.sega.general.model.Card"));
        Object term245424 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term245425 = newInstance(Class.forName("java.time.LocalDate"));
        Object term245429 = newInstance(Class.forName("java.time.LocalTime"));
        Object term245434 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term245435 = newInstance(Class.forName("java.time.LocalDate"));
        Object term245439 = newInstance(Class.forName("java.time.LocalTime"));
        setLongField(term245406, term245406.getClass(), "id", 6258088989451208329L);
        setLongField(term245408, term245408.getClass(), "id", -4993325194615343376L);
        setField(term245408, term245408.getClass(), "extId", term245410);
        setField(term245408, term245408.getClass(), "luid", "UQFCGhBwRP");
        setIntField(term245425, term245425.getClass(), "year", 2010);
        setShortField(term245425, term245425.getClass(), "month", (short) 2);
        setShortField(term245425, term245425.getClass(), "day", (short) 11);
        setField(term245424, term245424.getClass(), "date", term245425);
        setByteField(term245429, term245429.getClass(), "hour", (byte) 12);
        setByteField(term245429, term245429.getClass(), "minute", (byte) 49);
        setByteField(term245429, term245429.getClass(), "second", (byte) 35);
        setIntField(term245429, term245429.getClass(), "nano", 685384504);
        setField(term245424, term245424.getClass(), "time", term245429);
        setField(term245408, term245408.getClass(), "registerTime", term245424);
        setIntField(term245435, term245435.getClass(), "year", 2024);
        setShortField(term245435, term245435.getClass(), "month", (short) 8);
        setShortField(term245435, term245435.getClass(), "day", (short) 7);
        setField(term245434, term245434.getClass(), "date", term245435);
        setByteField(term245439, term245439.getClass(), "hour", (byte) 8);
        setByteField(term245439, term245439.getClass(), "minute", (byte) 41);
        setByteField(term245439, term245439.getClass(), "second", (byte) 36);
        setIntField(term245439, term245439.getClass(), "nano", 84091386);
        setField(term245434, term245434.getClass(), "time", term245439);
        setField(term245408, term245408.getClass(), "accessTime", term245434);
        setField(term245406, term245406.getClass(), "card", term245408);
        setField(term245406, term245406.getClass(), "userName", "IKUCiyluwb");
        setIntField(term245406, term245406.getClass(), "isNetMember", -609562912);
        setIntField(term245406, term245406.getClass(), "iconId", -1417204225);
        setIntField(term245406, term245406.getClass(), "plateId", 1033124516);
        setIntField(term245406, term245406.getClass(), "titleId", -2034452011);
        setIntField(term245406, term245406.getClass(), "partnerId", 83285907);
        setIntField(term245406, term245406.getClass(), "frameId", 137869647);
        setIntField(term245406, term245406.getClass(), "selectMapId", -641148370);
        setIntField(term245406, term245406.getClass(), "totalAwake", 2003661423);
        setIntField(term245406, term245406.getClass(), "gradeRating", 870043783);
        setIntField(term245406, term245406.getClass(), "musicRating", 643945557);
        setIntField(term245406, term245406.getClass(), "playerRating", 276441632);
        setIntField(term245406, term245406.getClass(), "highestRating", -556077472);
        setIntField(term245406, term245406.getClass(), "gradeRank", 1592695310);
        setIntField(term245406, term245406.getClass(), "classRank", -728764834);
        setIntField(term245406, term245406.getClass(), "courseRank", -992158957);
        setField(term245406, term245406.getClass(), "charaSlot", term245471);
        setField(term245406, term245406.getClass(), "charaLockSlot", term245487);
        setLongField(term245406, term245406.getClass(), "contentBit", 60920379124929106L);
        setIntField(term245406, term245406.getClass(), "playCount", 1638488155);
        setField(term245406, term245406.getClass(), "eventWatchedDate", "OIVvPvythq");
        setField(term245406, term245406.getClass(), "lastGameId", "OIRXQPPjVx");
        setField(term245406, term245406.getClass(), "lastRomVersion", "SxVFmiOidb");
        setField(term245406, term245406.getClass(), "lastDataVersion", "BsiZGiodQR");
        setField(term245406, term245406.getClass(), "lastLoginDate", "oJyzXrwmfx");
        setField(term245406, term245406.getClass(), "lastPlayDate", "RsEXdKLcXN");
        setIntField(term245406, term245406.getClass(), "lastPlayCredit", -1011938930);
        setIntField(term245406, term245406.getClass(), "lastPlayMode", -374210090);
        setIntField(term245406, term245406.getClass(), "lastPlaceId", 1118760300);
        setField(term245406, term245406.getClass(), "lastPlaceName", "zoOFEvSdRU");
        setIntField(term245406, term245406.getClass(), "lastAllNetId", 843719523);
        setIntField(term245406, term245406.getClass(), "lastRegionId", -815481212);
        setField(term245406, term245406.getClass(), "lastRegionName", "WtywQPTOaF");
        setField(term245406, term245406.getClass(), "lastClientId", "MZMkZoDeKG");
        setField(term245406, term245406.getClass(), "lastCountryCode", "JWhhCdUerg");
        setIntField(term245406, term245406.getClass(), "lastSelectEMoney", -1439310082);
        setIntField(term245406, term245406.getClass(), "lastSelectTicket", 312293379);
        setIntField(term245406, term245406.getClass(), "lastSelectCourse", 241022625);
        setIntField(term245406, term245406.getClass(), "lastCountCourse", 25543628);
        setField(term245406, term245406.getClass(), "firstGameId", "DrlBWOScgm");
        setField(term245406, term245406.getClass(), "firstRomVersion", "dOAfAvZzvo");
        setField(term245406, term245406.getClass(), "firstDataVersion", "FEfDieFUtF");
        setField(term245406, term245406.getClass(), "firstPlayDate", "OvdIsypBPN");
        setField(term245406, term245406.getClass(), "compatibleCmVersion", "NJNxLsnXOW");
        setField(term245406, term245406.getClass(), "dailyBonusDate", "GwcBHiivYy");
        setField(term245406, term245406.getClass(), "dailyCourseBonusDate", "ABHmWCUreJ");
        setField(term245406, term245406.getClass(), "lastPairLoginDate", "uvkCPATnTh");
        setField(term245406, term245406.getClass(), "lastTrialPlayDate", "ZggbZCwwZM");
        setIntField(term245406, term245406.getClass(), "playVsCount", 88927707);
        setIntField(term245406, term245406.getClass(), "playSyncCount", 573060356);
        setIntField(term245406, term245406.getClass(), "winCount", 1701020279);
        setIntField(term245406, term245406.getClass(), "helpCount", 1578074399);
        setIntField(term245406, term245406.getClass(), "comboCount", 1266129777);
        setLongField(term245406, term245406.getClass(), "totalDeluxscore", 144651909277527635L);
        setLongField(term245406, term245406.getClass(), "totalBasicDeluxscore", 1342009833658976057L);
        setLongField(term245406, term245406.getClass(), "totalAdvancedDeluxscore", -6603952203904631941L);
        setLongField(term245406, term245406.getClass(), "totalExpertDeluxscore", -6759487886069093698L);
        setLongField(term245406, term245406.getClass(), "totalMasterDeluxscore", 5476845655483774178L);
        setLongField(term245406, term245406.getClass(), "totalReMasterDeluxscore", 1064924295514704385L);
        setIntField(term245406, term245406.getClass(), "totalSync", -2062665446);
        setIntField(term245406, term245406.getClass(), "totalBasicSync", 766366420);
        setIntField(term245406, term245406.getClass(), "totalAdvancedSync", -440483620);
        setIntField(term245406, term245406.getClass(), "totalExpertSync", -63052239);
        setIntField(term245406, term245406.getClass(), "totalMasterSync", -302024503);
        setIntField(term245406, term245406.getClass(), "totalReMasterSync", -1240468791);
        setLongField(term245406, term245406.getClass(), "totalAchievement", -8214081883287786854L);
        setLongField(term245406, term245406.getClass(), "totalBasicAchievement", 7232800302054977343L);
        setLongField(term245406, term245406.getClass(), "totalAdvancedAchievement", -5032863289051512463L);
        setLongField(term245406, term245406.getClass(), "totalExpertAchievement", -5346594643757814884L);
        setLongField(term245406, term245406.getClass(), "totalMasterAchievement", -4048029769311364016L);
        setLongField(term245406, term245406.getClass(), "totalReMasterAchievement", -410800111156348638L);
        setLongField(term245406, term245406.getClass(), "playerOldRating", 2498023275613583331L);
        setLongField(term245406, term245406.getClass(), "playerNewRating", 2976412438547970313L);
        setIntField(term245406, term245406.getClass(), "banState", 1973145098);
        setLongField(term245406, term245406.getClass(), "dateTime", -6837683800645116802L);
        term245759 = new Integer(-75514449);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.maimai2.model.userdata.UserDetail");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = int.class;
        Object[] args = new Object[1];
        args[0] = term245759;
        callMethod(klass, "setGradeRating", argTypes, term245406, args);
    }

};


