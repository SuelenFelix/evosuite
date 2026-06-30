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

public class UserDetail_getComboCount_207955244955 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term226213;

    public UserDetail_getComboCount_207955244955() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Long term226217 = new Long(-4003544865306793676L);
        Integer term226280 = new Integer(1688840379);
        ArrayList term226278 = new ArrayList();
        ((ArrayList) term226278).add(term226280);
        Integer term226286 = new Integer(-1811534908);
        Integer term226288 = new Integer(-1024774970);
        Integer term226290 = new Integer(191435935);
        Integer term226292 = new Integer(-1320856251);
        Integer term226294 = new Integer(957604584);
        Integer term226296 = new Integer(1124496804);
        Integer term226298 = new Integer(-792786703);
        Integer term226300 = new Integer(331010013);
        Integer term226302 = new Integer(275287586);
        ArrayList term226284 = new ArrayList();
        ((ArrayList) term226284).add(term226286);
        ((ArrayList) term226284).add(term226288);
        ((ArrayList) term226284).add(term226290);
        ((ArrayList) term226284).add(term226292);
        ((ArrayList) term226284).add(term226294);
        ((ArrayList) term226284).add(term226296);
        ((ArrayList) term226284).add(term226298);
        ((ArrayList) term226284).add(term226300);
        ((ArrayList) term226284).add(term226302);
        term226213 = newInstance(Class.forName("icu.samnyan.aqua.sega.maimai2.model.userdata.UserDetail"));
        Object term226215 = newInstance(Class.forName("icu.samnyan.aqua.sega.general.model.Card"));
        Object term226231 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term226232 = newInstance(Class.forName("java.time.LocalDate"));
        Object term226236 = newInstance(Class.forName("java.time.LocalTime"));
        Object term226241 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term226242 = newInstance(Class.forName("java.time.LocalDate"));
        Object term226246 = newInstance(Class.forName("java.time.LocalTime"));
        setLongField(term226213, term226213.getClass(), "id", -6497077470652020501L);
        setLongField(term226215, term226215.getClass(), "id", 7303414244814770322L);
        setField(term226215, term226215.getClass(), "extId", term226217);
        setField(term226215, term226215.getClass(), "luid", "HLrCvrzuTI");
        setIntField(term226232, term226232.getClass(), "year", 2018);
        setShortField(term226232, term226232.getClass(), "month", (short) 2);
        setShortField(term226232, term226232.getClass(), "day", (short) 20);
        setField(term226231, term226231.getClass(), "date", term226232);
        setByteField(term226236, term226236.getClass(), "hour", (byte) 11);
        setByteField(term226236, term226236.getClass(), "minute", (byte) 56);
        setByteField(term226236, term226236.getClass(), "second", (byte) 7);
        setIntField(term226236, term226236.getClass(), "nano", 207490568);
        setField(term226231, term226231.getClass(), "time", term226236);
        setField(term226215, term226215.getClass(), "registerTime", term226231);
        setIntField(term226242, term226242.getClass(), "year", 2022);
        setShortField(term226242, term226242.getClass(), "month", (short) 7);
        setShortField(term226242, term226242.getClass(), "day", (short) 12);
        setField(term226241, term226241.getClass(), "date", term226242);
        setByteField(term226246, term226246.getClass(), "hour", (byte) 1);
        setByteField(term226246, term226246.getClass(), "minute", (byte) 2);
        setByteField(term226246, term226246.getClass(), "second", (byte) 5);
        setIntField(term226246, term226246.getClass(), "nano", 25761524);
        setField(term226241, term226241.getClass(), "time", term226246);
        setField(term226215, term226215.getClass(), "accessTime", term226241);
        setField(term226213, term226213.getClass(), "card", term226215);
        setField(term226213, term226213.getClass(), "userName", "ljsmTMvgTG");
        setIntField(term226213, term226213.getClass(), "isNetMember", -1548567396);
        setIntField(term226213, term226213.getClass(), "iconId", -1192782958);
        setIntField(term226213, term226213.getClass(), "plateId", 1654390448);
        setIntField(term226213, term226213.getClass(), "titleId", 1172969270);
        setIntField(term226213, term226213.getClass(), "partnerId", -742134992);
        setIntField(term226213, term226213.getClass(), "frameId", 1533756452);
        setIntField(term226213, term226213.getClass(), "selectMapId", -1888445182);
        setIntField(term226213, term226213.getClass(), "totalAwake", 166690129);
        setIntField(term226213, term226213.getClass(), "gradeRating", 242187277);
        setIntField(term226213, term226213.getClass(), "musicRating", 1023640987);
        setIntField(term226213, term226213.getClass(), "playerRating", -63686617);
        setIntField(term226213, term226213.getClass(), "highestRating", 895105769);
        setIntField(term226213, term226213.getClass(), "gradeRank", -241787119);
        setIntField(term226213, term226213.getClass(), "classRank", -405191607);
        setIntField(term226213, term226213.getClass(), "courseRank", -1381524213);
        setField(term226213, term226213.getClass(), "charaSlot", term226278);
        setField(term226213, term226213.getClass(), "charaLockSlot", term226284);
        setLongField(term226213, term226213.getClass(), "contentBit", -5710353143857259966L);
        setIntField(term226213, term226213.getClass(), "playCount", -519703952);
        setField(term226213, term226213.getClass(), "eventWatchedDate", "SvZVhBPcjK");
        setField(term226213, term226213.getClass(), "lastGameId", "JihKJuVbQI");
        setField(term226213, term226213.getClass(), "lastRomVersion", "nenRtMWwiS");
        setField(term226213, term226213.getClass(), "lastDataVersion", "KiauapEvQX");
        setField(term226213, term226213.getClass(), "lastLoginDate", "JFqCltusci");
        setField(term226213, term226213.getClass(), "lastPlayDate", "CQDMYzEnmt");
        setIntField(term226213, term226213.getClass(), "lastPlayCredit", 890243475);
        setIntField(term226213, term226213.getClass(), "lastPlayMode", -641853683);
        setIntField(term226213, term226213.getClass(), "lastPlaceId", -397533636);
        setField(term226213, term226213.getClass(), "lastPlaceName", "MCCXNLKile");
        setIntField(term226213, term226213.getClass(), "lastAllNetId", -224543032);
        setIntField(term226213, term226213.getClass(), "lastRegionId", -347362358);
        setField(term226213, term226213.getClass(), "lastRegionName", "jUSBTYPPFt");
        setField(term226213, term226213.getClass(), "lastClientId", "jJtudqtLhf");
        setField(term226213, term226213.getClass(), "lastCountryCode", "EhfPOdaJdQ");
        setIntField(term226213, term226213.getClass(), "lastSelectEMoney", 252203752);
        setIntField(term226213, term226213.getClass(), "lastSelectTicket", 1848173042);
        setIntField(term226213, term226213.getClass(), "lastSelectCourse", 287572725);
        setIntField(term226213, term226213.getClass(), "lastCountCourse", 900847726);
        setField(term226213, term226213.getClass(), "firstGameId", "KoTunRQrvH");
        setField(term226213, term226213.getClass(), "firstRomVersion", "WEDoAQHAFg");
        setField(term226213, term226213.getClass(), "firstDataVersion", "TDwsNJKaql");
        setField(term226213, term226213.getClass(), "firstPlayDate", "OuxgUlcbAs");
        setField(term226213, term226213.getClass(), "compatibleCmVersion", "ZTSRAqJUkK");
        setField(term226213, term226213.getClass(), "dailyBonusDate", "hnHAGEsrzw");
        setField(term226213, term226213.getClass(), "dailyCourseBonusDate", "EznFFdnKQD");
        setField(term226213, term226213.getClass(), "lastPairLoginDate", "tvBudEtoqr");
        setField(term226213, term226213.getClass(), "lastTrialPlayDate", "ExUWFRqPXf");
        setIntField(term226213, term226213.getClass(), "playVsCount", 266617808);
        setIntField(term226213, term226213.getClass(), "playSyncCount", 1590332494);
        setIntField(term226213, term226213.getClass(), "winCount", -1493499628);
        setIntField(term226213, term226213.getClass(), "helpCount", -1696939361);
        setIntField(term226213, term226213.getClass(), "comboCount", 1195351748);
        setLongField(term226213, term226213.getClass(), "totalDeluxscore", 9137128163873801102L);
        setLongField(term226213, term226213.getClass(), "totalBasicDeluxscore", -5094047922496720971L);
        setLongField(term226213, term226213.getClass(), "totalAdvancedDeluxscore", 5637017051115054752L);
        setLongField(term226213, term226213.getClass(), "totalExpertDeluxscore", 1284898884974047648L);
        setLongField(term226213, term226213.getClass(), "totalMasterDeluxscore", -1999224272669818099L);
        setLongField(term226213, term226213.getClass(), "totalReMasterDeluxscore", -1474649360128434645L);
        setIntField(term226213, term226213.getClass(), "totalSync", 1149553126);
        setIntField(term226213, term226213.getClass(), "totalBasicSync", -1838453620);
        setIntField(term226213, term226213.getClass(), "totalAdvancedSync", -148539898);
        setIntField(term226213, term226213.getClass(), "totalExpertSync", 254902560);
        setIntField(term226213, term226213.getClass(), "totalMasterSync", 92634753);
        setIntField(term226213, term226213.getClass(), "totalReMasterSync", 465922946);
        setLongField(term226213, term226213.getClass(), "totalAchievement", 6893932243006371587L);
        setLongField(term226213, term226213.getClass(), "totalBasicAchievement", -7702057743711326700L);
        setLongField(term226213, term226213.getClass(), "totalAdvancedAchievement", -1736190174758030847L);
        setLongField(term226213, term226213.getClass(), "totalExpertAchievement", 3403199788023038385L);
        setLongField(term226213, term226213.getClass(), "totalMasterAchievement", 313282191329776502L);
        setLongField(term226213, term226213.getClass(), "totalReMasterAchievement", 8142865199942375989L);
        setLongField(term226213, term226213.getClass(), "playerOldRating", -8158315682107732056L);
        setLongField(term226213, term226213.getClass(), "playerNewRating", -7943631067445632207L);
        setIntField(term226213, term226213.getClass(), "banState", -553407174);
        setLongField(term226213, term226213.getClass(), "dateTime", -508849502348132649L);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.maimai2.model.userdata.UserDetail");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getComboCount", argTypes, term226213, args);
    }

};


