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

public class UserDetail_setDailyBonusDate_994231919123 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term265591;

    public UserDetail_setDailyBonusDate_994231919123() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Long term265595 = new Long(-4855037955202452256L);
        Integer term265658 = new Integer(343920197);
        Integer term265660 = new Integer(-521630681);
        Integer term265662 = new Integer(1297681432);
        Integer term265664 = new Integer(820668311);
        Integer term265666 = new Integer(-43239204);
        Integer term265668 = new Integer(-1525054580);
        Integer term265670 = new Integer(1528804559);
        Integer term265672 = new Integer(-706860271);
        Integer term265674 = new Integer(-1268460209);
        ArrayList term265656 = new ArrayList();
        ((ArrayList) term265656).add(term265658);
        ((ArrayList) term265656).add(term265660);
        ((ArrayList) term265656).add(term265662);
        ((ArrayList) term265656).add(term265664);
        ((ArrayList) term265656).add(term265666);
        ((ArrayList) term265656).add(term265668);
        ((ArrayList) term265656).add(term265670);
        ((ArrayList) term265656).add(term265672);
        ((ArrayList) term265656).add(term265674);
        Integer term265680 = new Integer(1050300885);
        Integer term265682 = new Integer(-1623966228);
        Integer term265684 = new Integer(1085534206);
        Integer term265686 = new Integer(-825946504);
        Integer term265688 = new Integer(1618408809);
        Integer term265690 = new Integer(1511487617);
        Integer term265692 = new Integer(338598562);
        Integer term265694 = new Integer(1528748257);
        ArrayList term265678 = new ArrayList();
        ((ArrayList) term265678).add(term265680);
        ((ArrayList) term265678).add(term265682);
        ((ArrayList) term265678).add(term265684);
        ((ArrayList) term265678).add(term265686);
        ((ArrayList) term265678).add(term265688);
        ((ArrayList) term265678).add(term265690);
        ((ArrayList) term265678).add(term265692);
        ((ArrayList) term265678).add(term265694);
        term265591 = newInstance(Class.forName("icu.samnyan.aqua.sega.maimai2.model.userdata.UserDetail"));
        Object term265593 = newInstance(Class.forName("icu.samnyan.aqua.sega.general.model.Card"));
        Object term265609 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term265610 = newInstance(Class.forName("java.time.LocalDate"));
        Object term265614 = newInstance(Class.forName("java.time.LocalTime"));
        Object term265619 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term265620 = newInstance(Class.forName("java.time.LocalDate"));
        Object term265624 = newInstance(Class.forName("java.time.LocalTime"));
        setLongField(term265591, term265591.getClass(), "id", -5112786717824112028L);
        setLongField(term265593, term265593.getClass(), "id", 7394369680521553467L);
        setField(term265593, term265593.getClass(), "extId", term265595);
        setField(term265593, term265593.getClass(), "luid", "UKoBRBiZED");
        setIntField(term265610, term265610.getClass(), "year", 2024);
        setShortField(term265610, term265610.getClass(), "month", (short) 11);
        setShortField(term265610, term265610.getClass(), "day", (short) 30);
        setField(term265609, term265609.getClass(), "date", term265610);
        setByteField(term265614, term265614.getClass(), "hour", (byte) 4);
        setByteField(term265614, term265614.getClass(), "minute", (byte) 23);
        setByteField(term265614, term265614.getClass(), "second", (byte) 32);
        setIntField(term265614, term265614.getClass(), "nano", 784828432);
        setField(term265609, term265609.getClass(), "time", term265614);
        setField(term265593, term265593.getClass(), "registerTime", term265609);
        setIntField(term265620, term265620.getClass(), "year", 2019);
        setShortField(term265620, term265620.getClass(), "month", (short) 1);
        setShortField(term265620, term265620.getClass(), "day", (short) 31);
        setField(term265619, term265619.getClass(), "date", term265620);
        setByteField(term265624, term265624.getClass(), "hour", (byte) 8);
        setByteField(term265624, term265624.getClass(), "minute", (byte) 28);
        setByteField(term265624, term265624.getClass(), "second", (byte) 32);
        setIntField(term265624, term265624.getClass(), "nano", 828700368);
        setField(term265619, term265619.getClass(), "time", term265624);
        setField(term265593, term265593.getClass(), "accessTime", term265619);
        setField(term265591, term265591.getClass(), "card", term265593);
        setField(term265591, term265591.getClass(), "userName", "QYLIYhaAna");
        setIntField(term265591, term265591.getClass(), "isNetMember", 168003679);
        setIntField(term265591, term265591.getClass(), "iconId", -511272275);
        setIntField(term265591, term265591.getClass(), "plateId", 1286033228);
        setIntField(term265591, term265591.getClass(), "titleId", 37500894);
        setIntField(term265591, term265591.getClass(), "partnerId", 503695686);
        setIntField(term265591, term265591.getClass(), "frameId", -1814609220);
        setIntField(term265591, term265591.getClass(), "selectMapId", 1195361675);
        setIntField(term265591, term265591.getClass(), "totalAwake", 1206774620);
        setIntField(term265591, term265591.getClass(), "gradeRating", -1666994610);
        setIntField(term265591, term265591.getClass(), "musicRating", 1170271662);
        setIntField(term265591, term265591.getClass(), "playerRating", 1879274593);
        setIntField(term265591, term265591.getClass(), "highestRating", -10590168);
        setIntField(term265591, term265591.getClass(), "gradeRank", 1187185068);
        setIntField(term265591, term265591.getClass(), "classRank", 884648970);
        setIntField(term265591, term265591.getClass(), "courseRank", 1798950422);
        setField(term265591, term265591.getClass(), "charaSlot", term265656);
        setField(term265591, term265591.getClass(), "charaLockSlot", term265678);
        setLongField(term265591, term265591.getClass(), "contentBit", -8511823382790310363L);
        setIntField(term265591, term265591.getClass(), "playCount", -934527554);
        setField(term265591, term265591.getClass(), "eventWatchedDate", "HzMfMKgKlf");
        setField(term265591, term265591.getClass(), "lastGameId", "syeDEkvOkO");
        setField(term265591, term265591.getClass(), "lastRomVersion", "sgApZzdiHM");
        setField(term265591, term265591.getClass(), "lastDataVersion", "vAEHmJcPSd");
        setField(term265591, term265591.getClass(), "lastLoginDate", "dOvqKQlKUa");
        setField(term265591, term265591.getClass(), "lastPlayDate", "ZjyndZHfXg");
        setIntField(term265591, term265591.getClass(), "lastPlayCredit", 283508422);
        setIntField(term265591, term265591.getClass(), "lastPlayMode", 288863000);
        setIntField(term265591, term265591.getClass(), "lastPlaceId", 1431879138);
        setField(term265591, term265591.getClass(), "lastPlaceName", "mWarigMEMX");
        setIntField(term265591, term265591.getClass(), "lastAllNetId", -2046261620);
        setIntField(term265591, term265591.getClass(), "lastRegionId", -374355651);
        setField(term265591, term265591.getClass(), "lastRegionName", "UbOEkDKQTT");
        setField(term265591, term265591.getClass(), "lastClientId", "IWWuxiwNhE");
        setField(term265591, term265591.getClass(), "lastCountryCode", "tecOgyBctJ");
        setIntField(term265591, term265591.getClass(), "lastSelectEMoney", -1213488752);
        setIntField(term265591, term265591.getClass(), "lastSelectTicket", -847273841);
        setIntField(term265591, term265591.getClass(), "lastSelectCourse", -1067049532);
        setIntField(term265591, term265591.getClass(), "lastCountCourse", 1636487213);
        setField(term265591, term265591.getClass(), "firstGameId", "rSSuONUDGA");
        setField(term265591, term265591.getClass(), "firstRomVersion", "WmInSFSxSk");
        setField(term265591, term265591.getClass(), "firstDataVersion", "rmbZwfUyua");
        setField(term265591, term265591.getClass(), "firstPlayDate", "GzCjLjIGCd");
        setField(term265591, term265591.getClass(), "compatibleCmVersion", "oYSEWvyjcR");
        setField(term265591, term265591.getClass(), "dailyBonusDate", "VMmhmTHSAL");
        setField(term265591, term265591.getClass(), "dailyCourseBonusDate", "XGtrhXNaMV");
        setField(term265591, term265591.getClass(), "lastPairLoginDate", "KlhHeZgItV");
        setField(term265591, term265591.getClass(), "lastTrialPlayDate", "YGWvExlOFa");
        setIntField(term265591, term265591.getClass(), "playVsCount", -1975395435);
        setIntField(term265591, term265591.getClass(), "playSyncCount", 1108779869);
        setIntField(term265591, term265591.getClass(), "winCount", -1526342029);
        setIntField(term265591, term265591.getClass(), "helpCount", 926654899);
        setIntField(term265591, term265591.getClass(), "comboCount", -1424346655);
        setLongField(term265591, term265591.getClass(), "totalDeluxscore", -455412652094118573L);
        setLongField(term265591, term265591.getClass(), "totalBasicDeluxscore", -693011621792110410L);
        setLongField(term265591, term265591.getClass(), "totalAdvancedDeluxscore", 7399897939384962727L);
        setLongField(term265591, term265591.getClass(), "totalExpertDeluxscore", -7483777678852087471L);
        setLongField(term265591, term265591.getClass(), "totalMasterDeluxscore", 3611599920923632705L);
        setLongField(term265591, term265591.getClass(), "totalReMasterDeluxscore", 6951838095340097487L);
        setIntField(term265591, term265591.getClass(), "totalSync", 1992994085);
        setIntField(term265591, term265591.getClass(), "totalBasicSync", -1942011950);
        setIntField(term265591, term265591.getClass(), "totalAdvancedSync", -523308369);
        setIntField(term265591, term265591.getClass(), "totalExpertSync", 1162627136);
        setIntField(term265591, term265591.getClass(), "totalMasterSync", -1275316800);
        setIntField(term265591, term265591.getClass(), "totalReMasterSync", 151380700);
        setLongField(term265591, term265591.getClass(), "totalAchievement", -5470583704778763979L);
        setLongField(term265591, term265591.getClass(), "totalBasicAchievement", -7892236256492456815L);
        setLongField(term265591, term265591.getClass(), "totalAdvancedAchievement", -5878274573505968598L);
        setLongField(term265591, term265591.getClass(), "totalExpertAchievement", -7179962669306447196L);
        setLongField(term265591, term265591.getClass(), "totalMasterAchievement", 6185842529763056152L);
        setLongField(term265591, term265591.getClass(), "totalReMasterAchievement", -7881011809148121056L);
        setLongField(term265591, term265591.getClass(), "playerOldRating", 764914334968214354L);
        setLongField(term265591, term265591.getClass(), "playerNewRating", 3084530353378648272L);
        setIntField(term265591, term265591.getClass(), "banState", 1777983178);
        setLongField(term265591, term265591.getClass(), "dateTime", -4596852458061284153L);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.maimai2.model.userdata.UserDetail");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.String");
        Object[] args = new Object[1];
        args[0] = "DtiQRHgJmm";
        callMethod(klass, "setDailyBonusDate", argTypes, term265591, args);
    }

};


