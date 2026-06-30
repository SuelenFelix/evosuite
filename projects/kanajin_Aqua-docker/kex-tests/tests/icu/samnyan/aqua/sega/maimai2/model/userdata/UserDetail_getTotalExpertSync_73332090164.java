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

public class UserDetail_getTotalExpertSync_73332090164 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term4265772;

    public UserDetail_getTotalExpertSync_73332090164() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Long term4265776 = new Long(-4350871807993032884L);
        Integer term4265839 = new Integer(1399803639);
        Integer term4265841 = new Integer(160926225);
        Integer term4265843 = new Integer(-1541440051);
        Integer term4265845 = new Integer(440254626);
        Integer term4265847 = new Integer(2001906899);
        ArrayList term4265837 = new ArrayList();
        ((ArrayList) term4265837).add(term4265839);
        ((ArrayList) term4265837).add(term4265841);
        ((ArrayList) term4265837).add(term4265843);
        ((ArrayList) term4265837).add(term4265845);
        ((ArrayList) term4265837).add(term4265847);
        Integer term4265853 = new Integer(532379889);
        Integer term4265855 = new Integer(-1084521349);
        Integer term4265857 = new Integer(-1930705611);
        Integer term4265859 = new Integer(1949222496);
        ArrayList term4265851 = new ArrayList();
        ((ArrayList) term4265851).add(term4265853);
        ((ArrayList) term4265851).add(term4265855);
        ((ArrayList) term4265851).add(term4265857);
        ((ArrayList) term4265851).add(term4265859);
        term4265772 = newInstance(Class.forName("icu.samnyan.aqua.sega.maimai2.model.userdata.UserDetail"));
        Object term4265774 = newInstance(Class.forName("icu.samnyan.aqua.sega.general.model.Card"));
        Object term4265790 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term4265791 = newInstance(Class.forName("java.time.LocalDate"));
        Object term4265795 = newInstance(Class.forName("java.time.LocalTime"));
        Object term4265800 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term4265801 = newInstance(Class.forName("java.time.LocalDate"));
        Object term4265805 = newInstance(Class.forName("java.time.LocalTime"));
        setLongField(term4265772, term4265772.getClass(), "id", -3219947798625091512L);
        setLongField(term4265774, term4265774.getClass(), "id", -914953127160339952L);
        setField(term4265774, term4265774.getClass(), "extId", term4265776);
        setField(term4265774, term4265774.getClass(), "luid", "HfhjKVcIlp");
        setIntField(term4265791, term4265791.getClass(), "year", 2026);
        setShortField(term4265791, term4265791.getClass(), "month", (short) 9);
        setShortField(term4265791, term4265791.getClass(), "day", (short) 7);
        setField(term4265790, term4265790.getClass(), "date", term4265791);
        setByteField(term4265795, term4265795.getClass(), "hour", (byte) 4);
        setByteField(term4265795, term4265795.getClass(), "minute", (byte) 39);
        setByteField(term4265795, term4265795.getClass(), "second", (byte) 4);
        setIntField(term4265795, term4265795.getClass(), "nano", 896892623);
        setField(term4265790, term4265790.getClass(), "time", term4265795);
        setField(term4265774, term4265774.getClass(), "registerTime", term4265790);
        setIntField(term4265801, term4265801.getClass(), "year", 2023);
        setShortField(term4265801, term4265801.getClass(), "month", (short) 6);
        setShortField(term4265801, term4265801.getClass(), "day", (short) 12);
        setField(term4265800, term4265800.getClass(), "date", term4265801);
        setByteField(term4265805, term4265805.getClass(), "hour", (byte) 5);
        setByteField(term4265805, term4265805.getClass(), "minute", (byte) 47);
        setByteField(term4265805, term4265805.getClass(), "second", (byte) 18);
        setIntField(term4265805, term4265805.getClass(), "nano", 113818156);
        setField(term4265800, term4265800.getClass(), "time", term4265805);
        setField(term4265774, term4265774.getClass(), "accessTime", term4265800);
        setField(term4265772, term4265772.getClass(), "card", term4265774);
        setField(term4265772, term4265772.getClass(), "userName", "EvxXEVWdDP");
        setIntField(term4265772, term4265772.getClass(), "isNetMember", -1819399650);
        setIntField(term4265772, term4265772.getClass(), "iconId", -981024487);
        setIntField(term4265772, term4265772.getClass(), "plateId", 1983684850);
        setIntField(term4265772, term4265772.getClass(), "titleId", 1353776548);
        setIntField(term4265772, term4265772.getClass(), "partnerId", -1407941944);
        setIntField(term4265772, term4265772.getClass(), "frameId", 1600627230);
        setIntField(term4265772, term4265772.getClass(), "selectMapId", -1350797586);
        setIntField(term4265772, term4265772.getClass(), "totalAwake", 150560825);
        setIntField(term4265772, term4265772.getClass(), "gradeRating", -877942300);
        setIntField(term4265772, term4265772.getClass(), "musicRating", 1761924583);
        setIntField(term4265772, term4265772.getClass(), "playerRating", 886654902);
        setIntField(term4265772, term4265772.getClass(), "highestRating", -742236539);
        setIntField(term4265772, term4265772.getClass(), "gradeRank", -776385989);
        setIntField(term4265772, term4265772.getClass(), "classRank", 1929560279);
        setIntField(term4265772, term4265772.getClass(), "courseRank", 1800894617);
        setField(term4265772, term4265772.getClass(), "charaSlot", term4265837);
        setField(term4265772, term4265772.getClass(), "charaLockSlot", term4265851);
        setLongField(term4265772, term4265772.getClass(), "contentBit", 7895846448383956168L);
        setIntField(term4265772, term4265772.getClass(), "playCount", -690196704);
        setField(term4265772, term4265772.getClass(), "eventWatchedDate", "PHRREPuQpw");
        setField(term4265772, term4265772.getClass(), "lastGameId", "hRujFqOmNY");
        setField(term4265772, term4265772.getClass(), "lastRomVersion", "pMGrercJBI");
        setField(term4265772, term4265772.getClass(), "lastDataVersion", "qlKxmkKhxQ");
        setField(term4265772, term4265772.getClass(), "lastLoginDate", "wOjlhRotJa");
        setField(term4265772, term4265772.getClass(), "lastPlayDate", "QgjbhrTeqy");
        setIntField(term4265772, term4265772.getClass(), "lastPlayCredit", 1457616832);
        setIntField(term4265772, term4265772.getClass(), "lastPlayMode", -695761973);
        setIntField(term4265772, term4265772.getClass(), "lastPlaceId", 1200109497);
        setField(term4265772, term4265772.getClass(), "lastPlaceName", "ujSmmVvWFu");
        setIntField(term4265772, term4265772.getClass(), "lastAllNetId", 1185102979);
        setIntField(term4265772, term4265772.getClass(), "lastRegionId", -520687627);
        setField(term4265772, term4265772.getClass(), "lastRegionName", "TiRJzlinPE");
        setField(term4265772, term4265772.getClass(), "lastClientId", "DiUYjajVMe");
        setField(term4265772, term4265772.getClass(), "lastCountryCode", "nZDIsIMJUy");
        setIntField(term4265772, term4265772.getClass(), "lastSelectEMoney", -1064288589);
        setIntField(term4265772, term4265772.getClass(), "lastSelectTicket", 1930939663);
        setIntField(term4265772, term4265772.getClass(), "lastSelectCourse", 1745861562);
        setIntField(term4265772, term4265772.getClass(), "lastCountCourse", 184843406);
        setField(term4265772, term4265772.getClass(), "firstGameId", "bsDzUfWgnb");
        setField(term4265772, term4265772.getClass(), "firstRomVersion", "MvlgaBFwpD");
        setField(term4265772, term4265772.getClass(), "firstDataVersion", "ebbCmhqUPv");
        setField(term4265772, term4265772.getClass(), "firstPlayDate", "plpcBAOLTj");
        setField(term4265772, term4265772.getClass(), "compatibleCmVersion", "qCJaPjmKYj");
        setField(term4265772, term4265772.getClass(), "dailyBonusDate", "kTljhEUHGn");
        setField(term4265772, term4265772.getClass(), "dailyCourseBonusDate", "EXleoxxbuF");
        setField(term4265772, term4265772.getClass(), "lastPairLoginDate", "oSZARosIzI");
        setField(term4265772, term4265772.getClass(), "lastTrialPlayDate", "GpPXvomsKd");
        setIntField(term4265772, term4265772.getClass(), "playVsCount", -742430621);
        setIntField(term4265772, term4265772.getClass(), "playSyncCount", 1677817777);
        setIntField(term4265772, term4265772.getClass(), "winCount", -45581736);
        setIntField(term4265772, term4265772.getClass(), "helpCount", -642294701);
        setIntField(term4265772, term4265772.getClass(), "comboCount", 504909739);
        setLongField(term4265772, term4265772.getClass(), "totalDeluxscore", -31242053921990215L);
        setLongField(term4265772, term4265772.getClass(), "totalBasicDeluxscore", 1563097265759858864L);
        setLongField(term4265772, term4265772.getClass(), "totalAdvancedDeluxscore", -3410718348127881218L);
        setLongField(term4265772, term4265772.getClass(), "totalExpertDeluxscore", 5971484009245444245L);
        setLongField(term4265772, term4265772.getClass(), "totalMasterDeluxscore", 2313029330564051548L);
        setLongField(term4265772, term4265772.getClass(), "totalReMasterDeluxscore", 8189136586871389495L);
        setIntField(term4265772, term4265772.getClass(), "totalSync", -909288617);
        setIntField(term4265772, term4265772.getClass(), "totalBasicSync", -636201044);
        setIntField(term4265772, term4265772.getClass(), "totalAdvancedSync", -695413174);
        setIntField(term4265772, term4265772.getClass(), "totalExpertSync", 2059999652);
        setIntField(term4265772, term4265772.getClass(), "totalMasterSync", -125746661);
        setIntField(term4265772, term4265772.getClass(), "totalReMasterSync", 1394810161);
        setLongField(term4265772, term4265772.getClass(), "totalAchievement", 8136952288632483157L);
        setLongField(term4265772, term4265772.getClass(), "totalBasicAchievement", 5609893702859001281L);
        setLongField(term4265772, term4265772.getClass(), "totalAdvancedAchievement", 311407507598344782L);
        setLongField(term4265772, term4265772.getClass(), "totalExpertAchievement", 8614395995125738062L);
        setLongField(term4265772, term4265772.getClass(), "totalMasterAchievement", 2578708454423363513L);
        setLongField(term4265772, term4265772.getClass(), "totalReMasterAchievement", -3894754301461583185L);
        setLongField(term4265772, term4265772.getClass(), "playerOldRating", 1975874229729445750L);
        setLongField(term4265772, term4265772.getClass(), "playerNewRating", 4698484552951262571L);
        setIntField(term4265772, term4265772.getClass(), "banState", -844932332);
        setLongField(term4265772, term4265772.getClass(), "dateTime", -128595153279013002L);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.maimai2.model.userdata.UserDetail");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getTotalExpertSync", argTypes, term4265772, args);
    }

};


