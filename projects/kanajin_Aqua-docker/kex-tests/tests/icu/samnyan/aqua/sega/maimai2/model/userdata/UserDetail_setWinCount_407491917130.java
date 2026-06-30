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

public class UserDetail_setWinCount_407491917130 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term269154;
     Object term269517;

    public UserDetail_setWinCount_407491917130() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Long term269158 = new Long(3824691451696451167L);
        Integer term269221 = new Integer(-1160759211);
        Integer term269223 = new Integer(118302577);
        Integer term269225 = new Integer(-1192086944);
        Integer term269227 = new Integer(1689097670);
        Integer term269229 = new Integer(-229058840);
        Integer term269231 = new Integer(-445086770);
        Integer term269233 = new Integer(1555977804);
        Integer term269235 = new Integer(-1039875364);
        ArrayList term269219 = new ArrayList();
        ((ArrayList) term269219).add(term269221);
        ((ArrayList) term269219).add(term269223);
        ((ArrayList) term269219).add(term269225);
        ((ArrayList) term269219).add(term269227);
        ((ArrayList) term269219).add(term269229);
        ((ArrayList) term269219).add(term269231);
        ((ArrayList) term269219).add(term269233);
        ((ArrayList) term269219).add(term269235);
        Integer term269241 = new Integer(-908724029);
        Integer term269243 = new Integer(1122198417);
        Integer term269245 = new Integer(1853596233);
        Integer term269247 = new Integer(995880114);
        ArrayList term269239 = new ArrayList();
        ((ArrayList) term269239).add(term269241);
        ((ArrayList) term269239).add(term269243);
        ((ArrayList) term269239).add(term269245);
        ((ArrayList) term269239).add(term269247);
        term269154 = newInstance(Class.forName("icu.samnyan.aqua.sega.maimai2.model.userdata.UserDetail"));
        Object term269156 = newInstance(Class.forName("icu.samnyan.aqua.sega.general.model.Card"));
        Object term269172 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term269173 = newInstance(Class.forName("java.time.LocalDate"));
        Object term269177 = newInstance(Class.forName("java.time.LocalTime"));
        Object term269182 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term269183 = newInstance(Class.forName("java.time.LocalDate"));
        Object term269187 = newInstance(Class.forName("java.time.LocalTime"));
        setLongField(term269154, term269154.getClass(), "id", 1326058378264662866L);
        setLongField(term269156, term269156.getClass(), "id", 1813323343069269665L);
        setField(term269156, term269156.getClass(), "extId", term269158);
        setField(term269156, term269156.getClass(), "luid", "PwerdBbWmr");
        setIntField(term269173, term269173.getClass(), "year", 2025);
        setShortField(term269173, term269173.getClass(), "month", (short) 4);
        setShortField(term269173, term269173.getClass(), "day", (short) 11);
        setField(term269172, term269172.getClass(), "date", term269173);
        setByteField(term269177, term269177.getClass(), "hour", (byte) 5);
        setByteField(term269177, term269177.getClass(), "minute", (byte) 16);
        setByteField(term269177, term269177.getClass(), "second", (byte) 25);
        setIntField(term269177, term269177.getClass(), "nano", 178363433);
        setField(term269172, term269172.getClass(), "time", term269177);
        setField(term269156, term269156.getClass(), "registerTime", term269172);
        setIntField(term269183, term269183.getClass(), "year", 2025);
        setShortField(term269183, term269183.getClass(), "month", (short) 8);
        setShortField(term269183, term269183.getClass(), "day", (short) 12);
        setField(term269182, term269182.getClass(), "date", term269183);
        setByteField(term269187, term269187.getClass(), "hour", (byte) 13);
        setByteField(term269187, term269187.getClass(), "minute", (byte) 18);
        setByteField(term269187, term269187.getClass(), "second", (byte) 4);
        setIntField(term269187, term269187.getClass(), "nano", 550437598);
        setField(term269182, term269182.getClass(), "time", term269187);
        setField(term269156, term269156.getClass(), "accessTime", term269182);
        setField(term269154, term269154.getClass(), "card", term269156);
        setField(term269154, term269154.getClass(), "userName", "QoaNPXGspI");
        setIntField(term269154, term269154.getClass(), "isNetMember", -1493279078);
        setIntField(term269154, term269154.getClass(), "iconId", 639737443);
        setIntField(term269154, term269154.getClass(), "plateId", 916435001);
        setIntField(term269154, term269154.getClass(), "titleId", 589036561);
        setIntField(term269154, term269154.getClass(), "partnerId", 272900436);
        setIntField(term269154, term269154.getClass(), "frameId", -514490601);
        setIntField(term269154, term269154.getClass(), "selectMapId", -1010178423);
        setIntField(term269154, term269154.getClass(), "totalAwake", 938778978);
        setIntField(term269154, term269154.getClass(), "gradeRating", -1314147994);
        setIntField(term269154, term269154.getClass(), "musicRating", -1120741921);
        setIntField(term269154, term269154.getClass(), "playerRating", 1584813896);
        setIntField(term269154, term269154.getClass(), "highestRating", 678376088);
        setIntField(term269154, term269154.getClass(), "gradeRank", -1372919168);
        setIntField(term269154, term269154.getClass(), "classRank", -1947772440);
        setIntField(term269154, term269154.getClass(), "courseRank", -1418556051);
        setField(term269154, term269154.getClass(), "charaSlot", term269219);
        setField(term269154, term269154.getClass(), "charaLockSlot", term269239);
        setLongField(term269154, term269154.getClass(), "contentBit", -5620942992068411045L);
        setIntField(term269154, term269154.getClass(), "playCount", -336128698);
        setField(term269154, term269154.getClass(), "eventWatchedDate", "HGsYknyqnw");
        setField(term269154, term269154.getClass(), "lastGameId", "nSSaTIcgNB");
        setField(term269154, term269154.getClass(), "lastRomVersion", "XjDbTjwIhO");
        setField(term269154, term269154.getClass(), "lastDataVersion", "zcTaqvZYPD");
        setField(term269154, term269154.getClass(), "lastLoginDate", "VcPYeZWbaV");
        setField(term269154, term269154.getClass(), "lastPlayDate", "vZXmZnJkmA");
        setIntField(term269154, term269154.getClass(), "lastPlayCredit", 125498217);
        setIntField(term269154, term269154.getClass(), "lastPlayMode", 1952902014);
        setIntField(term269154, term269154.getClass(), "lastPlaceId", -1288918594);
        setField(term269154, term269154.getClass(), "lastPlaceName", "DLsTUONaVG");
        setIntField(term269154, term269154.getClass(), "lastAllNetId", 1636943183);
        setIntField(term269154, term269154.getClass(), "lastRegionId", 342127359);
        setField(term269154, term269154.getClass(), "lastRegionName", "CMxBJvoWmb");
        setField(term269154, term269154.getClass(), "lastClientId", "gxdAZEpSgS");
        setField(term269154, term269154.getClass(), "lastCountryCode", "JKJdAtnrrF");
        setIntField(term269154, term269154.getClass(), "lastSelectEMoney", 539999937);
        setIntField(term269154, term269154.getClass(), "lastSelectTicket", 310856051);
        setIntField(term269154, term269154.getClass(), "lastSelectCourse", 1384079547);
        setIntField(term269154, term269154.getClass(), "lastCountCourse", -1674866308);
        setField(term269154, term269154.getClass(), "firstGameId", "GpoyHXGieZ");
        setField(term269154, term269154.getClass(), "firstRomVersion", "cEFsvMVCTU");
        setField(term269154, term269154.getClass(), "firstDataVersion", "AqNriHImMY");
        setField(term269154, term269154.getClass(), "firstPlayDate", "mwSajMxzKy");
        setField(term269154, term269154.getClass(), "compatibleCmVersion", "mmzfmREmvG");
        setField(term269154, term269154.getClass(), "dailyBonusDate", "QDgqKUuIMf");
        setField(term269154, term269154.getClass(), "dailyCourseBonusDate", "KSrOHHauRF");
        setField(term269154, term269154.getClass(), "lastPairLoginDate", "crvtEHvIWK");
        setField(term269154, term269154.getClass(), "lastTrialPlayDate", "glDRFmYutu");
        setIntField(term269154, term269154.getClass(), "playVsCount", -1810236008);
        setIntField(term269154, term269154.getClass(), "playSyncCount", -1145916647);
        setIntField(term269154, term269154.getClass(), "winCount", -952656690);
        setIntField(term269154, term269154.getClass(), "helpCount", -1864087046);
        setIntField(term269154, term269154.getClass(), "comboCount", -450161434);
        setLongField(term269154, term269154.getClass(), "totalDeluxscore", 2275077944887622701L);
        setLongField(term269154, term269154.getClass(), "totalBasicDeluxscore", 366169856585292509L);
        setLongField(term269154, term269154.getClass(), "totalAdvancedDeluxscore", -7194096385812163162L);
        setLongField(term269154, term269154.getClass(), "totalExpertDeluxscore", -5703668087978241594L);
        setLongField(term269154, term269154.getClass(), "totalMasterDeluxscore", 572336995117588615L);
        setLongField(term269154, term269154.getClass(), "totalReMasterDeluxscore", -2911773388465607040L);
        setIntField(term269154, term269154.getClass(), "totalSync", 259091897);
        setIntField(term269154, term269154.getClass(), "totalBasicSync", -157779882);
        setIntField(term269154, term269154.getClass(), "totalAdvancedSync", 402378808);
        setIntField(term269154, term269154.getClass(), "totalExpertSync", 355737852);
        setIntField(term269154, term269154.getClass(), "totalMasterSync", -1259559367);
        setIntField(term269154, term269154.getClass(), "totalReMasterSync", 782057284);
        setLongField(term269154, term269154.getClass(), "totalAchievement", 8593789537428513006L);
        setLongField(term269154, term269154.getClass(), "totalBasicAchievement", -3251912231126297265L);
        setLongField(term269154, term269154.getClass(), "totalAdvancedAchievement", 7287058424451282850L);
        setLongField(term269154, term269154.getClass(), "totalExpertAchievement", 4386351002495729148L);
        setLongField(term269154, term269154.getClass(), "totalMasterAchievement", -2334700607136621482L);
        setLongField(term269154, term269154.getClass(), "totalReMasterAchievement", 8625716850409865655L);
        setLongField(term269154, term269154.getClass(), "playerOldRating", 663928308842821678L);
        setLongField(term269154, term269154.getClass(), "playerNewRating", -3106988846066392263L);
        setIntField(term269154, term269154.getClass(), "banState", -1312026978);
        setLongField(term269154, term269154.getClass(), "dateTime", -8853492436888099709L);
        term269517 = new Integer(327560526);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.maimai2.model.userdata.UserDetail");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = int.class;
        Object[] args = new Object[1];
        args[0] = term269517;
        callMethod(klass, "setWinCount", argTypes, term269154, args);
    }

};


