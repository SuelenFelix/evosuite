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

public class UserCharge_getId_1252795301 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term120945;

    public UserCharge_getId_1252795301() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Long term120951 = new Long(5973526439563541711L);
        Integer term121014 = new Integer(918882916);
        Integer term121016 = new Integer(1544012770);
        Integer term121018 = new Integer(1922068039);
        Integer term121020 = new Integer(-410564443);
        Integer term121022 = new Integer(996017434);
        Integer term121024 = new Integer(-983870300);
        Integer term121026 = new Integer(360715062);
        ArrayList term121012 = new ArrayList();
        ((ArrayList) term121012).add(term121014);
        ((ArrayList) term121012).add(term121016);
        ((ArrayList) term121012).add(term121018);
        ((ArrayList) term121012).add(term121020);
        ((ArrayList) term121012).add(term121022);
        ((ArrayList) term121012).add(term121024);
        ((ArrayList) term121012).add(term121026);
        Integer term121032 = new Integer(1047409266);
        Integer term121034 = new Integer(1427248961);
        ArrayList term121030 = new ArrayList();
        ((ArrayList) term121030).add(term121032);
        ((ArrayList) term121030).add(term121034);
        term120945 = newInstance(Class.forName("icu.samnyan.aqua.sega.maimai2.model.userdata.UserCharge"));
        Object term120947 = newInstance(Class.forName("icu.samnyan.aqua.sega.maimai2.model.userdata.UserDetail"));
        Object term120949 = newInstance(Class.forName("icu.samnyan.aqua.sega.general.model.Card"));
        Object term120965 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term120966 = newInstance(Class.forName("java.time.LocalDate"));
        Object term120970 = newInstance(Class.forName("java.time.LocalTime"));
        Object term120975 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term120976 = newInstance(Class.forName("java.time.LocalDate"));
        Object term120980 = newInstance(Class.forName("java.time.LocalTime"));
        setLongField(term120945, term120945.getClass(), "id", 8020550559849227814L);
        setLongField(term120947, term120947.getClass(), "id", 6556499840705187488L);
        setLongField(term120949, term120949.getClass(), "id", -4937484587771809733L);
        setField(term120949, term120949.getClass(), "extId", term120951);
        setField(term120949, term120949.getClass(), "luid", "lGNwldURrK");
        setIntField(term120966, term120966.getClass(), "year", 2017);
        setShortField(term120966, term120966.getClass(), "month", (short) 2);
        setShortField(term120966, term120966.getClass(), "day", (short) 28);
        setField(term120965, term120965.getClass(), "date", term120966);
        setByteField(term120970, term120970.getClass(), "hour", (byte) 16);
        setByteField(term120970, term120970.getClass(), "minute", (byte) 54);
        setByteField(term120970, term120970.getClass(), "second", (byte) 4);
        setIntField(term120970, term120970.getClass(), "nano", 721722853);
        setField(term120965, term120965.getClass(), "time", term120970);
        setField(term120949, term120949.getClass(), "registerTime", term120965);
        setIntField(term120976, term120976.getClass(), "year", 2018);
        setShortField(term120976, term120976.getClass(), "month", (short) 8);
        setShortField(term120976, term120976.getClass(), "day", (short) 4);
        setField(term120975, term120975.getClass(), "date", term120976);
        setByteField(term120980, term120980.getClass(), "hour", (byte) 8);
        setByteField(term120980, term120980.getClass(), "minute", (byte) 15);
        setByteField(term120980, term120980.getClass(), "second", (byte) 15);
        setIntField(term120980, term120980.getClass(), "nano", 116834692);
        setField(term120975, term120975.getClass(), "time", term120980);
        setField(term120949, term120949.getClass(), "accessTime", term120975);
        setField(term120947, term120947.getClass(), "card", term120949);
        setField(term120947, term120947.getClass(), "userName", "AfRMrnPQsz");
        setIntField(term120947, term120947.getClass(), "isNetMember", 284886453);
        setIntField(term120947, term120947.getClass(), "iconId", 81623981);
        setIntField(term120947, term120947.getClass(), "plateId", -1407481630);
        setIntField(term120947, term120947.getClass(), "titleId", -1963906003);
        setIntField(term120947, term120947.getClass(), "partnerId", -1380281551);
        setIntField(term120947, term120947.getClass(), "frameId", -2059295062);
        setIntField(term120947, term120947.getClass(), "selectMapId", 1107432374);
        setIntField(term120947, term120947.getClass(), "totalAwake", 1623768155);
        setIntField(term120947, term120947.getClass(), "gradeRating", -919788156);
        setIntField(term120947, term120947.getClass(), "musicRating", 29020862);
        setIntField(term120947, term120947.getClass(), "playerRating", 1981104215);
        setIntField(term120947, term120947.getClass(), "highestRating", 2123592941);
        setIntField(term120947, term120947.getClass(), "gradeRank", 1043204008);
        setIntField(term120947, term120947.getClass(), "classRank", -2069490710);
        setIntField(term120947, term120947.getClass(), "courseRank", -336592077);
        setField(term120947, term120947.getClass(), "charaSlot", term121012);
        setField(term120947, term120947.getClass(), "charaLockSlot", term121030);
        setLongField(term120947, term120947.getClass(), "contentBit", -7245833890302920867L);
        setIntField(term120947, term120947.getClass(), "playCount", -1038346147);
        setField(term120947, term120947.getClass(), "eventWatchedDate", "ilHCxxLSlR");
        setField(term120947, term120947.getClass(), "lastGameId", "KINWoNPskz");
        setField(term120947, term120947.getClass(), "lastRomVersion", "ThcARbQtxE");
        setField(term120947, term120947.getClass(), "lastDataVersion", "zPIvKiioyO");
        setField(term120947, term120947.getClass(), "lastLoginDate", "gkpveaZSZa");
        setField(term120947, term120947.getClass(), "lastPlayDate", "MJwprBacue");
        setIntField(term120947, term120947.getClass(), "lastPlayCredit", -759212248);
        setIntField(term120947, term120947.getClass(), "lastPlayMode", 710373985);
        setIntField(term120947, term120947.getClass(), "lastPlaceId", -1098158176);
        setField(term120947, term120947.getClass(), "lastPlaceName", "mpuBHnTLtZ");
        setIntField(term120947, term120947.getClass(), "lastAllNetId", -187070398);
        setIntField(term120947, term120947.getClass(), "lastRegionId", -1230319081);
        setField(term120947, term120947.getClass(), "lastRegionName", "mwseGQwGCJ");
        setField(term120947, term120947.getClass(), "lastClientId", "GFnDQFsVrR");
        setField(term120947, term120947.getClass(), "lastCountryCode", "UQmUTrbRaN");
        setIntField(term120947, term120947.getClass(), "lastSelectEMoney", -108342419);
        setIntField(term120947, term120947.getClass(), "lastSelectTicket", -2084652820);
        setIntField(term120947, term120947.getClass(), "lastSelectCourse", -1596509485);
        setIntField(term120947, term120947.getClass(), "lastCountCourse", 1787629634);
        setField(term120947, term120947.getClass(), "firstGameId", "pJVgbTDDrd");
        setField(term120947, term120947.getClass(), "firstRomVersion", "UzXAOjUtTa");
        setField(term120947, term120947.getClass(), "firstDataVersion", "NjTyNZneQx");
        setField(term120947, term120947.getClass(), "firstPlayDate", "WZgjoyroht");
        setField(term120947, term120947.getClass(), "compatibleCmVersion", "WsLIuqMrjH");
        setField(term120947, term120947.getClass(), "dailyBonusDate", "bSGeeoWHWd");
        setField(term120947, term120947.getClass(), "dailyCourseBonusDate", "zrXiLofNaH");
        setField(term120947, term120947.getClass(), "lastPairLoginDate", "qNyGHnJtiu");
        setField(term120947, term120947.getClass(), "lastTrialPlayDate", "TEpyPHqnFK");
        setIntField(term120947, term120947.getClass(), "playVsCount", 746589330);
        setIntField(term120947, term120947.getClass(), "playSyncCount", -2087341902);
        setIntField(term120947, term120947.getClass(), "winCount", -1552395095);
        setIntField(term120947, term120947.getClass(), "helpCount", 1119787944);
        setIntField(term120947, term120947.getClass(), "comboCount", 2099414259);
        setLongField(term120947, term120947.getClass(), "totalDeluxscore", -8022774801267796171L);
        setLongField(term120947, term120947.getClass(), "totalBasicDeluxscore", -1219290427069101846L);
        setLongField(term120947, term120947.getClass(), "totalAdvancedDeluxscore", -6611343048483242997L);
        setLongField(term120947, term120947.getClass(), "totalExpertDeluxscore", 3182987509782180187L);
        setLongField(term120947, term120947.getClass(), "totalMasterDeluxscore", -4883788836369956506L);
        setLongField(term120947, term120947.getClass(), "totalReMasterDeluxscore", 1828579945139352205L);
        setIntField(term120947, term120947.getClass(), "totalSync", 1080055407);
        setIntField(term120947, term120947.getClass(), "totalBasicSync", -880340280);
        setIntField(term120947, term120947.getClass(), "totalAdvancedSync", -1194222550);
        setIntField(term120947, term120947.getClass(), "totalExpertSync", 566167796);
        setIntField(term120947, term120947.getClass(), "totalMasterSync", -1082962860);
        setIntField(term120947, term120947.getClass(), "totalReMasterSync", 1200402655);
        setLongField(term120947, term120947.getClass(), "totalAchievement", 7974624276262964833L);
        setLongField(term120947, term120947.getClass(), "totalBasicAchievement", 7593569489480297611L);
        setLongField(term120947, term120947.getClass(), "totalAdvancedAchievement", -6771193908629784176L);
        setLongField(term120947, term120947.getClass(), "totalExpertAchievement", -6018822049134958029L);
        setLongField(term120947, term120947.getClass(), "totalMasterAchievement", -641768322605539260L);
        setLongField(term120947, term120947.getClass(), "totalReMasterAchievement", 7489532448652137497L);
        setLongField(term120947, term120947.getClass(), "playerOldRating", 1741745847767936524L);
        setLongField(term120947, term120947.getClass(), "playerNewRating", -7813097860460548694L);
        setIntField(term120947, term120947.getClass(), "banState", -1500378498);
        setLongField(term120947, term120947.getClass(), "dateTime", -2180637454140991363L);
        setField(term120945, term120945.getClass(), "user", term120947);
        setIntField(term120945, term120945.getClass(), "chargeId", -1429162976);
        setIntField(term120945, term120945.getClass(), "stock", 1773815133);
        setField(term120945, term120945.getClass(), "purchaseDate", "IuajqwVUGv");
        setField(term120945, term120945.getClass(), "validDate", "XpFjyIwJKk");
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.maimai2.model.userdata.UserCharge");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getId", argTypes, term120945, args);
    }

};


