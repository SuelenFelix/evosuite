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

public class UserDetail_setPlateId_29544222182 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term4276062;
     Object term4276419;

    public UserDetail_setPlateId_29544222182() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Long term4276066 = new Long(-6897765086628386393L);
        Integer term4276129 = new Integer(1698188292);
        Integer term4276131 = new Integer(-602012601);
        Integer term4276133 = new Integer(1074862789);
        Integer term4276135 = new Integer(1938881305);
        Integer term4276137 = new Integer(300219839);
        ArrayList term4276127 = new ArrayList();
        ((ArrayList) term4276127).add(term4276129);
        ((ArrayList) term4276127).add(term4276131);
        ((ArrayList) term4276127).add(term4276133);
        ((ArrayList) term4276127).add(term4276135);
        ((ArrayList) term4276127).add(term4276137);
        Integer term4276143 = new Integer(962854007);
        Integer term4276145 = new Integer(824386522);
        Integer term4276147 = new Integer(-1414905297);
        Integer term4276149 = new Integer(1128316994);
        ArrayList term4276141 = new ArrayList();
        ((ArrayList) term4276141).add(term4276143);
        ((ArrayList) term4276141).add(term4276145);
        ((ArrayList) term4276141).add(term4276147);
        ((ArrayList) term4276141).add(term4276149);
        term4276062 = newInstance(Class.forName("icu.samnyan.aqua.sega.maimai2.model.userdata.UserDetail"));
        Object term4276064 = newInstance(Class.forName("icu.samnyan.aqua.sega.general.model.Card"));
        Object term4276080 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term4276081 = newInstance(Class.forName("java.time.LocalDate"));
        Object term4276085 = newInstance(Class.forName("java.time.LocalTime"));
        Object term4276090 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term4276091 = newInstance(Class.forName("java.time.LocalDate"));
        Object term4276095 = newInstance(Class.forName("java.time.LocalTime"));
        setLongField(term4276062, term4276062.getClass(), "id", -3216358520372476427L);
        setLongField(term4276064, term4276064.getClass(), "id", -6589485718492917600L);
        setField(term4276064, term4276064.getClass(), "extId", term4276066);
        setField(term4276064, term4276064.getClass(), "luid", "EtRDrmrmbE");
        setIntField(term4276081, term4276081.getClass(), "year", 2016);
        setShortField(term4276081, term4276081.getClass(), "month", (short) 9);
        setShortField(term4276081, term4276081.getClass(), "day", (short) 16);
        setField(term4276080, term4276080.getClass(), "date", term4276081);
        setByteField(term4276085, term4276085.getClass(), "hour", (byte) 11);
        setByteField(term4276085, term4276085.getClass(), "minute", (byte) 0);
        setByteField(term4276085, term4276085.getClass(), "second", (byte) 30);
        setIntField(term4276085, term4276085.getClass(), "nano", 301457600);
        setField(term4276080, term4276080.getClass(), "time", term4276085);
        setField(term4276064, term4276064.getClass(), "registerTime", term4276080);
        setIntField(term4276091, term4276091.getClass(), "year", 2023);
        setShortField(term4276091, term4276091.getClass(), "month", (short) 9);
        setShortField(term4276091, term4276091.getClass(), "day", (short) 14);
        setField(term4276090, term4276090.getClass(), "date", term4276091);
        setByteField(term4276095, term4276095.getClass(), "hour", (byte) 12);
        setByteField(term4276095, term4276095.getClass(), "minute", (byte) 11);
        setByteField(term4276095, term4276095.getClass(), "second", (byte) 38);
        setIntField(term4276095, term4276095.getClass(), "nano", 254494353);
        setField(term4276090, term4276090.getClass(), "time", term4276095);
        setField(term4276064, term4276064.getClass(), "accessTime", term4276090);
        setField(term4276062, term4276062.getClass(), "card", term4276064);
        setField(term4276062, term4276062.getClass(), "userName", "fzobsKPDoz");
        setIntField(term4276062, term4276062.getClass(), "isNetMember", -850345988);
        setIntField(term4276062, term4276062.getClass(), "iconId", -1431327931);
        setIntField(term4276062, term4276062.getClass(), "plateId", -1985559768);
        setIntField(term4276062, term4276062.getClass(), "titleId", 2114264039);
        setIntField(term4276062, term4276062.getClass(), "partnerId", 245564076);
        setIntField(term4276062, term4276062.getClass(), "frameId", -1615881925);
        setIntField(term4276062, term4276062.getClass(), "selectMapId", 2132754081);
        setIntField(term4276062, term4276062.getClass(), "totalAwake", -1790672559);
        setIntField(term4276062, term4276062.getClass(), "gradeRating", -444554973);
        setIntField(term4276062, term4276062.getClass(), "musicRating", -746075360);
        setIntField(term4276062, term4276062.getClass(), "playerRating", -2027129806);
        setIntField(term4276062, term4276062.getClass(), "highestRating", 1983026114);
        setIntField(term4276062, term4276062.getClass(), "gradeRank", 1006474732);
        setIntField(term4276062, term4276062.getClass(), "classRank", 129202734);
        setIntField(term4276062, term4276062.getClass(), "courseRank", -1009310222);
        setField(term4276062, term4276062.getClass(), "charaSlot", term4276127);
        setField(term4276062, term4276062.getClass(), "charaLockSlot", term4276141);
        setLongField(term4276062, term4276062.getClass(), "contentBit", 6496585336058904539L);
        setIntField(term4276062, term4276062.getClass(), "playCount", -346714566);
        setField(term4276062, term4276062.getClass(), "eventWatchedDate", "kibhTRWHcL");
        setField(term4276062, term4276062.getClass(), "lastGameId", "uFEGbEWIPn");
        setField(term4276062, term4276062.getClass(), "lastRomVersion", "OXfZxbSxWE");
        setField(term4276062, term4276062.getClass(), "lastDataVersion", "whtPbIvkqX");
        setField(term4276062, term4276062.getClass(), "lastLoginDate", "maHVXIzISV");
        setField(term4276062, term4276062.getClass(), "lastPlayDate", "PwdxewmRiQ");
        setIntField(term4276062, term4276062.getClass(), "lastPlayCredit", 63956283);
        setIntField(term4276062, term4276062.getClass(), "lastPlayMode", 588929256);
        setIntField(term4276062, term4276062.getClass(), "lastPlaceId", 1347848616);
        setField(term4276062, term4276062.getClass(), "lastPlaceName", "LRpkDkhDXt");
        setIntField(term4276062, term4276062.getClass(), "lastAllNetId", 1374046022);
        setIntField(term4276062, term4276062.getClass(), "lastRegionId", -2108167923);
        setField(term4276062, term4276062.getClass(), "lastRegionName", "ExaavIbBpP");
        setField(term4276062, term4276062.getClass(), "lastClientId", "CMMgKNUiGP");
        setField(term4276062, term4276062.getClass(), "lastCountryCode", "DPSBqoxhvB");
        setIntField(term4276062, term4276062.getClass(), "lastSelectEMoney", 1865504367);
        setIntField(term4276062, term4276062.getClass(), "lastSelectTicket", -1594823792);
        setIntField(term4276062, term4276062.getClass(), "lastSelectCourse", 1130468975);
        setIntField(term4276062, term4276062.getClass(), "lastCountCourse", 1134476173);
        setField(term4276062, term4276062.getClass(), "firstGameId", "lyvFXLLNqH");
        setField(term4276062, term4276062.getClass(), "firstRomVersion", "aFHtynrsZx");
        setField(term4276062, term4276062.getClass(), "firstDataVersion", "FdbHqanyzr");
        setField(term4276062, term4276062.getClass(), "firstPlayDate", "Kcqonzqdql");
        setField(term4276062, term4276062.getClass(), "compatibleCmVersion", "ZTsibcpGdi");
        setField(term4276062, term4276062.getClass(), "dailyBonusDate", "dDkdzEJWEo");
        setField(term4276062, term4276062.getClass(), "dailyCourseBonusDate", "GltkTvJDWN");
        setField(term4276062, term4276062.getClass(), "lastPairLoginDate", "NkAZFryqwt");
        setField(term4276062, term4276062.getClass(), "lastTrialPlayDate", "BXVaOhCBdW");
        setIntField(term4276062, term4276062.getClass(), "playVsCount", 1846788884);
        setIntField(term4276062, term4276062.getClass(), "playSyncCount", 1392327007);
        setIntField(term4276062, term4276062.getClass(), "winCount", 684072179);
        setIntField(term4276062, term4276062.getClass(), "helpCount", 1810260921);
        setIntField(term4276062, term4276062.getClass(), "comboCount", 2083629613);
        setLongField(term4276062, term4276062.getClass(), "totalDeluxscore", -358669169280458569L);
        setLongField(term4276062, term4276062.getClass(), "totalBasicDeluxscore", -4051732018073899896L);
        setLongField(term4276062, term4276062.getClass(), "totalAdvancedDeluxscore", -1841536762690003694L);
        setLongField(term4276062, term4276062.getClass(), "totalExpertDeluxscore", -116059589416191105L);
        setLongField(term4276062, term4276062.getClass(), "totalMasterDeluxscore", -4073039025062517303L);
        setLongField(term4276062, term4276062.getClass(), "totalReMasterDeluxscore", 7262519106187432568L);
        setIntField(term4276062, term4276062.getClass(), "totalSync", 1346615683);
        setIntField(term4276062, term4276062.getClass(), "totalBasicSync", 437872055);
        setIntField(term4276062, term4276062.getClass(), "totalAdvancedSync", -1963087803);
        setIntField(term4276062, term4276062.getClass(), "totalExpertSync", 1017738540);
        setIntField(term4276062, term4276062.getClass(), "totalMasterSync", 672953006);
        setIntField(term4276062, term4276062.getClass(), "totalReMasterSync", 118132859);
        setLongField(term4276062, term4276062.getClass(), "totalAchievement", 1369709100832628964L);
        setLongField(term4276062, term4276062.getClass(), "totalBasicAchievement", -6953963668409559966L);
        setLongField(term4276062, term4276062.getClass(), "totalAdvancedAchievement", 4062198060600623869L);
        setLongField(term4276062, term4276062.getClass(), "totalExpertAchievement", 7312020479960667306L);
        setLongField(term4276062, term4276062.getClass(), "totalMasterAchievement", -1134537553166975453L);
        setLongField(term4276062, term4276062.getClass(), "totalReMasterAchievement", 546709348686019261L);
        setLongField(term4276062, term4276062.getClass(), "playerOldRating", 1382354888072903425L);
        setLongField(term4276062, term4276062.getClass(), "playerNewRating", -6079991664297928244L);
        setIntField(term4276062, term4276062.getClass(), "banState", -79450945);
        setLongField(term4276062, term4276062.getClass(), "dateTime", -1877186865338662849L);
        term4276419 = new Integer(1647324141);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.maimai2.model.userdata.UserDetail");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = int.class;
        Object[] args = new Object[1];
        args[0] = term4276419;
        callMethod(klass, "setPlateId", argTypes, term4276062, args);
    }

};


