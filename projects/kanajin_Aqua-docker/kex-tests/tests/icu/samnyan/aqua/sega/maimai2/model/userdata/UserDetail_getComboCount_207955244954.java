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

public class UserDetail_getComboCount_207955244954 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term226158;

    public UserDetail_getComboCount_207955244954() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Long term226162 = new Long(-4003544865306793676L);
        Integer term226225 = new Integer(1688840379);
        ArrayList term226223 = new ArrayList();
        ((ArrayList) term226223).add(term226225);
        Integer term226231 = new Integer(-1811534908);
        Integer term226233 = new Integer(-1024774970);
        Integer term226235 = new Integer(191435935);
        Integer term226237 = new Integer(-1320856251);
        Integer term226239 = new Integer(957604584);
        Integer term226241 = new Integer(1124496804);
        Integer term226243 = new Integer(-792786703);
        Integer term226245 = new Integer(331010013);
        Integer term226247 = new Integer(275287586);
        ArrayList term226229 = new ArrayList();
        ((ArrayList) term226229).add(term226231);
        ((ArrayList) term226229).add(term226233);
        ((ArrayList) term226229).add(term226235);
        ((ArrayList) term226229).add(term226237);
        ((ArrayList) term226229).add(term226239);
        ((ArrayList) term226229).add(term226241);
        ((ArrayList) term226229).add(term226243);
        ((ArrayList) term226229).add(term226245);
        ((ArrayList) term226229).add(term226247);
        term226158 = newInstance(Class.forName("icu.samnyan.aqua.sega.maimai2.model.userdata.UserDetail"));
        Object term226160 = newInstance(Class.forName("icu.samnyan.aqua.sega.general.model.Card"));
        Object term226176 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term226177 = newInstance(Class.forName("java.time.LocalDate"));
        Object term226181 = newInstance(Class.forName("java.time.LocalTime"));
        Object term226186 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term226187 = newInstance(Class.forName("java.time.LocalDate"));
        Object term226191 = newInstance(Class.forName("java.time.LocalTime"));
        setLongField(term226158, term226158.getClass(), "id", -6497077470652020501L);
        setLongField(term226160, term226160.getClass(), "id", 7303414244814770322L);
        setField(term226160, term226160.getClass(), "extId", term226162);
        setField(term226160, term226160.getClass(), "luid", "HLrCvrzuTI");
        setIntField(term226177, term226177.getClass(), "year", 2018);
        setShortField(term226177, term226177.getClass(), "month", (short) 2);
        setShortField(term226177, term226177.getClass(), "day", (short) 20);
        setField(term226176, term226176.getClass(), "date", term226177);
        setByteField(term226181, term226181.getClass(), "hour", (byte) 11);
        setByteField(term226181, term226181.getClass(), "minute", (byte) 56);
        setByteField(term226181, term226181.getClass(), "second", (byte) 7);
        setIntField(term226181, term226181.getClass(), "nano", 207490568);
        setField(term226176, term226176.getClass(), "time", term226181);
        setField(term226160, term226160.getClass(), "registerTime", term226176);
        setIntField(term226187, term226187.getClass(), "year", 2022);
        setShortField(term226187, term226187.getClass(), "month", (short) 7);
        setShortField(term226187, term226187.getClass(), "day", (short) 12);
        setField(term226186, term226186.getClass(), "date", term226187);
        setByteField(term226191, term226191.getClass(), "hour", (byte) 1);
        setByteField(term226191, term226191.getClass(), "minute", (byte) 2);
        setByteField(term226191, term226191.getClass(), "second", (byte) 5);
        setIntField(term226191, term226191.getClass(), "nano", 25761524);
        setField(term226186, term226186.getClass(), "time", term226191);
        setField(term226160, term226160.getClass(), "accessTime", term226186);
        setField(term226158, term226158.getClass(), "card", term226160);
        setField(term226158, term226158.getClass(), "userName", "ljsmTMvgTG");
        setIntField(term226158, term226158.getClass(), "isNetMember", -1548567396);
        setIntField(term226158, term226158.getClass(), "iconId", -1192782958);
        setIntField(term226158, term226158.getClass(), "plateId", 1654390448);
        setIntField(term226158, term226158.getClass(), "titleId", 1172969270);
        setIntField(term226158, term226158.getClass(), "partnerId", -742134992);
        setIntField(term226158, term226158.getClass(), "frameId", 1533756452);
        setIntField(term226158, term226158.getClass(), "selectMapId", -1888445182);
        setIntField(term226158, term226158.getClass(), "totalAwake", 166690129);
        setIntField(term226158, term226158.getClass(), "gradeRating", 242187277);
        setIntField(term226158, term226158.getClass(), "musicRating", 1023640987);
        setIntField(term226158, term226158.getClass(), "playerRating", -63686617);
        setIntField(term226158, term226158.getClass(), "highestRating", 895105769);
        setIntField(term226158, term226158.getClass(), "gradeRank", -241787119);
        setIntField(term226158, term226158.getClass(), "classRank", -405191607);
        setIntField(term226158, term226158.getClass(), "courseRank", -1381524213);
        setField(term226158, term226158.getClass(), "charaSlot", term226223);
        setField(term226158, term226158.getClass(), "charaLockSlot", term226229);
        setLongField(term226158, term226158.getClass(), "contentBit", -5710353143857259966L);
        setIntField(term226158, term226158.getClass(), "playCount", -519703952);
        setField(term226158, term226158.getClass(), "eventWatchedDate", "SvZVhBPcjK");
        setField(term226158, term226158.getClass(), "lastGameId", "JihKJuVbQI");
        setField(term226158, term226158.getClass(), "lastRomVersion", "nenRtMWwiS");
        setField(term226158, term226158.getClass(), "lastDataVersion", "KiauapEvQX");
        setField(term226158, term226158.getClass(), "lastLoginDate", "JFqCltusci");
        setField(term226158, term226158.getClass(), "lastPlayDate", "CQDMYzEnmt");
        setIntField(term226158, term226158.getClass(), "lastPlayCredit", 890243475);
        setIntField(term226158, term226158.getClass(), "lastPlayMode", -641853683);
        setIntField(term226158, term226158.getClass(), "lastPlaceId", -397533636);
        setField(term226158, term226158.getClass(), "lastPlaceName", "MCCXNLKile");
        setIntField(term226158, term226158.getClass(), "lastAllNetId", -224543032);
        setIntField(term226158, term226158.getClass(), "lastRegionId", -347362358);
        setField(term226158, term226158.getClass(), "lastRegionName", "jUSBTYPPFt");
        setField(term226158, term226158.getClass(), "lastClientId", "jJtudqtLhf");
        setField(term226158, term226158.getClass(), "lastCountryCode", "EhfPOdaJdQ");
        setIntField(term226158, term226158.getClass(), "lastSelectEMoney", 252203752);
        setIntField(term226158, term226158.getClass(), "lastSelectTicket", 1848173042);
        setIntField(term226158, term226158.getClass(), "lastSelectCourse", 287572725);
        setIntField(term226158, term226158.getClass(), "lastCountCourse", 900847726);
        setField(term226158, term226158.getClass(), "firstGameId", "KoTunRQrvH");
        setField(term226158, term226158.getClass(), "firstRomVersion", "WEDoAQHAFg");
        setField(term226158, term226158.getClass(), "firstDataVersion", "TDwsNJKaql");
        setField(term226158, term226158.getClass(), "firstPlayDate", "OuxgUlcbAs");
        setField(term226158, term226158.getClass(), "compatibleCmVersion", "ZTSRAqJUkK");
        setField(term226158, term226158.getClass(), "dailyBonusDate", "hnHAGEsrzw");
        setField(term226158, term226158.getClass(), "dailyCourseBonusDate", "EznFFdnKQD");
        setField(term226158, term226158.getClass(), "lastPairLoginDate", "tvBudEtoqr");
        setField(term226158, term226158.getClass(), "lastTrialPlayDate", "ExUWFRqPXf");
        setIntField(term226158, term226158.getClass(), "playVsCount", 266617808);
        setIntField(term226158, term226158.getClass(), "playSyncCount", 1590332494);
        setIntField(term226158, term226158.getClass(), "winCount", -1493499628);
        setIntField(term226158, term226158.getClass(), "helpCount", -1696939361);
        setIntField(term226158, term226158.getClass(), "comboCount", 1195351748);
        setLongField(term226158, term226158.getClass(), "totalDeluxscore", 9137128163873801102L);
        setLongField(term226158, term226158.getClass(), "totalBasicDeluxscore", -5094047922496720971L);
        setLongField(term226158, term226158.getClass(), "totalAdvancedDeluxscore", 5637017051115054752L);
        setLongField(term226158, term226158.getClass(), "totalExpertDeluxscore", 1284898884974047648L);
        setLongField(term226158, term226158.getClass(), "totalMasterDeluxscore", -1999224272669818099L);
        setLongField(term226158, term226158.getClass(), "totalReMasterDeluxscore", -1474649360128434645L);
        setIntField(term226158, term226158.getClass(), "totalSync", 1149553126);
        setIntField(term226158, term226158.getClass(), "totalBasicSync", -1838453620);
        setIntField(term226158, term226158.getClass(), "totalAdvancedSync", -148539898);
        setIntField(term226158, term226158.getClass(), "totalExpertSync", 254902560);
        setIntField(term226158, term226158.getClass(), "totalMasterSync", 92634753);
        setIntField(term226158, term226158.getClass(), "totalReMasterSync", 465922946);
        setLongField(term226158, term226158.getClass(), "totalAchievement", 6893932243006371587L);
        setLongField(term226158, term226158.getClass(), "totalBasicAchievement", -7702057743711326700L);
        setLongField(term226158, term226158.getClass(), "totalAdvancedAchievement", -1736190174758030847L);
        setLongField(term226158, term226158.getClass(), "totalExpertAchievement", 3403199788023038385L);
        setLongField(term226158, term226158.getClass(), "totalMasterAchievement", 313282191329776502L);
        setLongField(term226158, term226158.getClass(), "totalReMasterAchievement", 8142865199942375989L);
        setLongField(term226158, term226158.getClass(), "playerOldRating", -8158315682107732056L);
        setLongField(term226158, term226158.getClass(), "playerNewRating", -7943631067445632207L);
        setIntField(term226158, term226158.getClass(), "banState", -553407174);
        setLongField(term226158, term226158.getClass(), "dateTime", -508849502348132649L);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.maimai2.model.userdata.UserDetail");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getComboCount", argTypes, term226158, args);
    }

};


