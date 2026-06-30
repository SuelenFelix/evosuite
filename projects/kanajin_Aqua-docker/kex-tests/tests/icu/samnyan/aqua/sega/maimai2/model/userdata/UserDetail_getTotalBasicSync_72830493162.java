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

public class UserDetail_getTotalBasicSync_72830493162 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term4264610;

    public UserDetail_getTotalBasicSync_72830493162() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Long term4264614 = new Long(-5366294806491775117L);
        Integer term4264677 = new Integer(1641465748);
        Integer term4264679 = new Integer(191297190);
        Integer term4264681 = new Integer(-184116368);
        Integer term4264683 = new Integer(-2078321901);
        Integer term4264685 = new Integer(644110294);
        Integer term4264687 = new Integer(858147518);
        Integer term4264689 = new Integer(-1727167401);
        Integer term4264691 = new Integer(-842185797);
        Integer term4264693 = new Integer(478918889);
        ArrayList term4264675 = new ArrayList();
        ((ArrayList) term4264675).add(term4264677);
        ((ArrayList) term4264675).add(term4264679);
        ((ArrayList) term4264675).add(term4264681);
        ((ArrayList) term4264675).add(term4264683);
        ((ArrayList) term4264675).add(term4264685);
        ((ArrayList) term4264675).add(term4264687);
        ((ArrayList) term4264675).add(term4264689);
        ((ArrayList) term4264675).add(term4264691);
        ((ArrayList) term4264675).add(term4264693);
        Integer term4264699 = new Integer(750079737);
        Integer term4264701 = new Integer(-1296400594);
        Integer term4264703 = new Integer(1238281654);
        Integer term4264705 = new Integer(369742636);
        Integer term4264707 = new Integer(-1541868819);
        ArrayList term4264697 = new ArrayList();
        ((ArrayList) term4264697).add(term4264699);
        ((ArrayList) term4264697).add(term4264701);
        ((ArrayList) term4264697).add(term4264703);
        ((ArrayList) term4264697).add(term4264705);
        ((ArrayList) term4264697).add(term4264707);
        term4264610 = newInstance(Class.forName("icu.samnyan.aqua.sega.maimai2.model.userdata.UserDetail"));
        Object term4264612 = newInstance(Class.forName("icu.samnyan.aqua.sega.general.model.Card"));
        Object term4264628 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term4264629 = newInstance(Class.forName("java.time.LocalDate"));
        Object term4264633 = newInstance(Class.forName("java.time.LocalTime"));
        Object term4264638 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term4264639 = newInstance(Class.forName("java.time.LocalDate"));
        Object term4264643 = newInstance(Class.forName("java.time.LocalTime"));
        setLongField(term4264610, term4264610.getClass(), "id", 526203440781676648L);
        setLongField(term4264612, term4264612.getClass(), "id", 7062613983408201084L);
        setField(term4264612, term4264612.getClass(), "extId", term4264614);
        setField(term4264612, term4264612.getClass(), "luid", "jZnnxVjCPS");
        setIntField(term4264629, term4264629.getClass(), "year", 2023);
        setShortField(term4264629, term4264629.getClass(), "month", (short) 12);
        setShortField(term4264629, term4264629.getClass(), "day", (short) 27);
        setField(term4264628, term4264628.getClass(), "date", term4264629);
        setByteField(term4264633, term4264633.getClass(), "hour", (byte) 8);
        setByteField(term4264633, term4264633.getClass(), "minute", (byte) 2);
        setByteField(term4264633, term4264633.getClass(), "second", (byte) 9);
        setIntField(term4264633, term4264633.getClass(), "nano", 965869790);
        setField(term4264628, term4264628.getClass(), "time", term4264633);
        setField(term4264612, term4264612.getClass(), "registerTime", term4264628);
        setIntField(term4264639, term4264639.getClass(), "year", 2027);
        setShortField(term4264639, term4264639.getClass(), "month", (short) 1);
        setShortField(term4264639, term4264639.getClass(), "day", (short) 10);
        setField(term4264638, term4264638.getClass(), "date", term4264639);
        setByteField(term4264643, term4264643.getClass(), "hour", (byte) 23);
        setByteField(term4264643, term4264643.getClass(), "minute", (byte) 46);
        setByteField(term4264643, term4264643.getClass(), "second", (byte) 38);
        setIntField(term4264643, term4264643.getClass(), "nano", 308425281);
        setField(term4264638, term4264638.getClass(), "time", term4264643);
        setField(term4264612, term4264612.getClass(), "accessTime", term4264638);
        setField(term4264610, term4264610.getClass(), "card", term4264612);
        setField(term4264610, term4264610.getClass(), "userName", "QqUzlRkgbr");
        setIntField(term4264610, term4264610.getClass(), "isNetMember", 1899872747);
        setIntField(term4264610, term4264610.getClass(), "iconId", 657868253);
        setIntField(term4264610, term4264610.getClass(), "plateId", -1203388761);
        setIntField(term4264610, term4264610.getClass(), "titleId", 220722071);
        setIntField(term4264610, term4264610.getClass(), "partnerId", -645781364);
        setIntField(term4264610, term4264610.getClass(), "frameId", 2057242588);
        setIntField(term4264610, term4264610.getClass(), "selectMapId", 801075640);
        setIntField(term4264610, term4264610.getClass(), "totalAwake", -594491792);
        setIntField(term4264610, term4264610.getClass(), "gradeRating", 1383690426);
        setIntField(term4264610, term4264610.getClass(), "musicRating", -577705348);
        setIntField(term4264610, term4264610.getClass(), "playerRating", 675427653);
        setIntField(term4264610, term4264610.getClass(), "highestRating", 492273427);
        setIntField(term4264610, term4264610.getClass(), "gradeRank", -1248190344);
        setIntField(term4264610, term4264610.getClass(), "classRank", -431491619);
        setIntField(term4264610, term4264610.getClass(), "courseRank", -1874808599);
        setField(term4264610, term4264610.getClass(), "charaSlot", term4264675);
        setField(term4264610, term4264610.getClass(), "charaLockSlot", term4264697);
        setLongField(term4264610, term4264610.getClass(), "contentBit", 3755093216645486951L);
        setIntField(term4264610, term4264610.getClass(), "playCount", 1875389680);
        setField(term4264610, term4264610.getClass(), "eventWatchedDate", "LcfecsjguT");
        setField(term4264610, term4264610.getClass(), "lastGameId", "IgIOpCwpmF");
        setField(term4264610, term4264610.getClass(), "lastRomVersion", "GYAmIxpHjv");
        setField(term4264610, term4264610.getClass(), "lastDataVersion", "scwhfWgxRG");
        setField(term4264610, term4264610.getClass(), "lastLoginDate", "ByboPtGQkf");
        setField(term4264610, term4264610.getClass(), "lastPlayDate", "lvxutvpDxi");
        setIntField(term4264610, term4264610.getClass(), "lastPlayCredit", -1687383340);
        setIntField(term4264610, term4264610.getClass(), "lastPlayMode", 1444433953);
        setIntField(term4264610, term4264610.getClass(), "lastPlaceId", 384319266);
        setField(term4264610, term4264610.getClass(), "lastPlaceName", "LArdEuNEmo");
        setIntField(term4264610, term4264610.getClass(), "lastAllNetId", -1669902517);
        setIntField(term4264610, term4264610.getClass(), "lastRegionId", 501307430);
        setField(term4264610, term4264610.getClass(), "lastRegionName", "ejBMtTRfpK");
        setField(term4264610, term4264610.getClass(), "lastClientId", "tByGLToVwp");
        setField(term4264610, term4264610.getClass(), "lastCountryCode", "FiDIeEKUnw");
        setIntField(term4264610, term4264610.getClass(), "lastSelectEMoney", 694309474);
        setIntField(term4264610, term4264610.getClass(), "lastSelectTicket", 718344503);
        setIntField(term4264610, term4264610.getClass(), "lastSelectCourse", 330298704);
        setIntField(term4264610, term4264610.getClass(), "lastCountCourse", -176761191);
        setField(term4264610, term4264610.getClass(), "firstGameId", "GUUSdfdhNf");
        setField(term4264610, term4264610.getClass(), "firstRomVersion", "UYHlicdncX");
        setField(term4264610, term4264610.getClass(), "firstDataVersion", "xGqvkFvxAP");
        setField(term4264610, term4264610.getClass(), "firstPlayDate", "PSblBQErnC");
        setField(term4264610, term4264610.getClass(), "compatibleCmVersion", "TlEphsSjGH");
        setField(term4264610, term4264610.getClass(), "dailyBonusDate", "PhkrCZdpTn");
        setField(term4264610, term4264610.getClass(), "dailyCourseBonusDate", "hHfqNsBoYi");
        setField(term4264610, term4264610.getClass(), "lastPairLoginDate", "DOcqNVRhtR");
        setField(term4264610, term4264610.getClass(), "lastTrialPlayDate", "vROwlMPYrT");
        setIntField(term4264610, term4264610.getClass(), "playVsCount", 1082030310);
        setIntField(term4264610, term4264610.getClass(), "playSyncCount", 1748118870);
        setIntField(term4264610, term4264610.getClass(), "winCount", 287001451);
        setIntField(term4264610, term4264610.getClass(), "helpCount", 1375334122);
        setIntField(term4264610, term4264610.getClass(), "comboCount", -1703173487);
        setLongField(term4264610, term4264610.getClass(), "totalDeluxscore", -4187246638827969653L);
        setLongField(term4264610, term4264610.getClass(), "totalBasicDeluxscore", -1547832977246347385L);
        setLongField(term4264610, term4264610.getClass(), "totalAdvancedDeluxscore", -7916715737729920317L);
        setLongField(term4264610, term4264610.getClass(), "totalExpertDeluxscore", 7705288104789227253L);
        setLongField(term4264610, term4264610.getClass(), "totalMasterDeluxscore", 5273246368623231173L);
        setLongField(term4264610, term4264610.getClass(), "totalReMasterDeluxscore", 1582856893614412287L);
        setIntField(term4264610, term4264610.getClass(), "totalSync", -1613452548);
        setIntField(term4264610, term4264610.getClass(), "totalBasicSync", 2109942230);
        setIntField(term4264610, term4264610.getClass(), "totalAdvancedSync", 707111280);
        setIntField(term4264610, term4264610.getClass(), "totalExpertSync", -1455598694);
        setIntField(term4264610, term4264610.getClass(), "totalMasterSync", 1842598297);
        setIntField(term4264610, term4264610.getClass(), "totalReMasterSync", 848722034);
        setLongField(term4264610, term4264610.getClass(), "totalAchievement", -4324782366385233682L);
        setLongField(term4264610, term4264610.getClass(), "totalBasicAchievement", -8998376302862968103L);
        setLongField(term4264610, term4264610.getClass(), "totalAdvancedAchievement", -5385306968167055944L);
        setLongField(term4264610, term4264610.getClass(), "totalExpertAchievement", -4348502427974965859L);
        setLongField(term4264610, term4264610.getClass(), "totalMasterAchievement", -6168205031100029856L);
        setLongField(term4264610, term4264610.getClass(), "totalReMasterAchievement", 5876635749030264467L);
        setLongField(term4264610, term4264610.getClass(), "playerOldRating", -2197336744418367799L);
        setLongField(term4264610, term4264610.getClass(), "playerNewRating", -7400903071007598414L);
        setIntField(term4264610, term4264610.getClass(), "banState", 1596075867);
        setLongField(term4264610, term4264610.getClass(), "dateTime", 5502733353967916960L);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.maimai2.model.userdata.UserDetail");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getTotalBasicSync", argTypes, term4264610, args);
    }

};


