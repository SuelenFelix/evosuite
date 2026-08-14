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

public class UserDetail_setTotalMasterDeluxscore_321222726136 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term273046;
     Object term273407;

    public UserDetail_setTotalMasterDeluxscore_321222726136() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Long term273050 = new Long(-4905558793519537969L);
        Integer term273113 = new Integer(-42540264);
        Integer term273115 = new Integer(-179532327);
        Integer term273117 = new Integer(1282999015);
        Integer term273119 = new Integer(1957459536);
        Integer term273121 = new Integer(1523266697);
        Integer term273123 = new Integer(487116383);
        ArrayList term273111 = new ArrayList();
        ((ArrayList) term273111).add(term273113);
        ((ArrayList) term273111).add(term273115);
        ((ArrayList) term273111).add(term273117);
        ((ArrayList) term273111).add(term273119);
        ((ArrayList) term273111).add(term273121);
        ((ArrayList) term273111).add(term273123);
        Integer term273129 = new Integer(968755800);
        Integer term273131 = new Integer(1491289140);
        Integer term273133 = new Integer(424804018);
        Integer term273135 = new Integer(835463182);
        Integer term273137 = new Integer(-1730193267);
        ArrayList term273127 = new ArrayList();
        ((ArrayList) term273127).add(term273129);
        ((ArrayList) term273127).add(term273131);
        ((ArrayList) term273127).add(term273133);
        ((ArrayList) term273127).add(term273135);
        ((ArrayList) term273127).add(term273137);
        term273046 = newInstance(Class.forName("icu.samnyan.aqua.sega.maimai2.model.userdata.UserDetail"));
        Object term273048 = newInstance(Class.forName("icu.samnyan.aqua.sega.general.model.Card"));
        Object term273064 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term273065 = newInstance(Class.forName("java.time.LocalDate"));
        Object term273069 = newInstance(Class.forName("java.time.LocalTime"));
        Object term273074 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term273075 = newInstance(Class.forName("java.time.LocalDate"));
        Object term273079 = newInstance(Class.forName("java.time.LocalTime"));
        setLongField(term273046, term273046.getClass(), "id", 6570760926306122921L);
        setLongField(term273048, term273048.getClass(), "id", -2485623213653262563L);
        setField(term273048, term273048.getClass(), "extId", term273050);
        setField(term273048, term273048.getClass(), "luid", "sMWFVIsJMj");
        setIntField(term273065, term273065.getClass(), "year", 2015);
        setShortField(term273065, term273065.getClass(), "month", (short) 5);
        setShortField(term273065, term273065.getClass(), "day", (short) 3);
        setField(term273064, term273064.getClass(), "date", term273065);
        setByteField(term273069, term273069.getClass(), "hour", (byte) 15);
        setByteField(term273069, term273069.getClass(), "minute", (byte) 13);
        setByteField(term273069, term273069.getClass(), "second", (byte) 30);
        setIntField(term273069, term273069.getClass(), "nano", 724073253);
        setField(term273064, term273064.getClass(), "time", term273069);
        setField(term273048, term273048.getClass(), "registerTime", term273064);
        setIntField(term273075, term273075.getClass(), "year", 2026);
        setShortField(term273075, term273075.getClass(), "month", (short) 2);
        setShortField(term273075, term273075.getClass(), "day", (short) 4);
        setField(term273074, term273074.getClass(), "date", term273075);
        setByteField(term273079, term273079.getClass(), "hour", (byte) 23);
        setByteField(term273079, term273079.getClass(), "minute", (byte) 53);
        setByteField(term273079, term273079.getClass(), "second", (byte) 24);
        setIntField(term273079, term273079.getClass(), "nano", 653800614);
        setField(term273074, term273074.getClass(), "time", term273079);
        setField(term273048, term273048.getClass(), "accessTime", term273074);
        setField(term273046, term273046.getClass(), "card", term273048);
        setField(term273046, term273046.getClass(), "userName", "XWepsdWPbm");
        setIntField(term273046, term273046.getClass(), "isNetMember", 773267702);
        setIntField(term273046, term273046.getClass(), "iconId", 1601947622);
        setIntField(term273046, term273046.getClass(), "plateId", 520571929);
        setIntField(term273046, term273046.getClass(), "titleId", 66693270);
        setIntField(term273046, term273046.getClass(), "partnerId", -573494857);
        setIntField(term273046, term273046.getClass(), "frameId", -1189565347);
        setIntField(term273046, term273046.getClass(), "selectMapId", -1173359956);
        setIntField(term273046, term273046.getClass(), "totalAwake", 328260180);
        setIntField(term273046, term273046.getClass(), "gradeRating", 1642593264);
        setIntField(term273046, term273046.getClass(), "musicRating", -1801395320);
        setIntField(term273046, term273046.getClass(), "playerRating", -1513570809);
        setIntField(term273046, term273046.getClass(), "highestRating", -51511899);
        setIntField(term273046, term273046.getClass(), "gradeRank", 1376274549);
        setIntField(term273046, term273046.getClass(), "classRank", -1293180900);
        setIntField(term273046, term273046.getClass(), "courseRank", -1320940649);
        setField(term273046, term273046.getClass(), "charaSlot", term273111);
        setField(term273046, term273046.getClass(), "charaLockSlot", term273127);
        setLongField(term273046, term273046.getClass(), "contentBit", 7637295978314861840L);
        setIntField(term273046, term273046.getClass(), "playCount", 129458680);
        setField(term273046, term273046.getClass(), "eventWatchedDate", "zGFPDuDbGy");
        setField(term273046, term273046.getClass(), "lastGameId", "DJWFLHPZno");
        setField(term273046, term273046.getClass(), "lastRomVersion", "iwcGksjeEo");
        setField(term273046, term273046.getClass(), "lastDataVersion", "ftOtxrQrKv");
        setField(term273046, term273046.getClass(), "lastLoginDate", "ykbbLncIeH");
        setField(term273046, term273046.getClass(), "lastPlayDate", "VGHbXUsaEW");
        setIntField(term273046, term273046.getClass(), "lastPlayCredit", 947006863);
        setIntField(term273046, term273046.getClass(), "lastPlayMode", -893561872);
        setIntField(term273046, term273046.getClass(), "lastPlaceId", 1277858599);
        setField(term273046, term273046.getClass(), "lastPlaceName", "QrPAoffYrM");
        setIntField(term273046, term273046.getClass(), "lastAllNetId", 2102505859);
        setIntField(term273046, term273046.getClass(), "lastRegionId", 472937435);
        setField(term273046, term273046.getClass(), "lastRegionName", "GdfyxzrJPi");
        setField(term273046, term273046.getClass(), "lastClientId", "gWDuljoCTx");
        setField(term273046, term273046.getClass(), "lastCountryCode", "VWFCiHNcuV");
        setIntField(term273046, term273046.getClass(), "lastSelectEMoney", -583961320);
        setIntField(term273046, term273046.getClass(), "lastSelectTicket", -2059122590);
        setIntField(term273046, term273046.getClass(), "lastSelectCourse", 1635028602);
        setIntField(term273046, term273046.getClass(), "lastCountCourse", -1584646798);
        setField(term273046, term273046.getClass(), "firstGameId", "oRdsFEiHOt");
        setField(term273046, term273046.getClass(), "firstRomVersion", "XLyilJzRkP");
        setField(term273046, term273046.getClass(), "firstDataVersion", "sYmdjjkiqc");
        setField(term273046, term273046.getClass(), "firstPlayDate", "DbPFJbunZe");
        setField(term273046, term273046.getClass(), "compatibleCmVersion", "rtoiCzynkp");
        setField(term273046, term273046.getClass(), "dailyBonusDate", "tqjEBbhLxB");
        setField(term273046, term273046.getClass(), "dailyCourseBonusDate", "uwRpAOBIsu");
        setField(term273046, term273046.getClass(), "lastPairLoginDate", "HqceiaTGDi");
        setField(term273046, term273046.getClass(), "lastTrialPlayDate", "dDFpJDkWtW");
        setIntField(term273046, term273046.getClass(), "playVsCount", 1012072498);
        setIntField(term273046, term273046.getClass(), "playSyncCount", -605073258);
        setIntField(term273046, term273046.getClass(), "winCount", 189747070);
        setIntField(term273046, term273046.getClass(), "helpCount", -1829678263);
        setIntField(term273046, term273046.getClass(), "comboCount", 101338111);
        setLongField(term273046, term273046.getClass(), "totalDeluxscore", 8354233249776570154L);
        setLongField(term273046, term273046.getClass(), "totalBasicDeluxscore", -7615645269616023008L);
        setLongField(term273046, term273046.getClass(), "totalAdvancedDeluxscore", 929374817434991687L);
        setLongField(term273046, term273046.getClass(), "totalExpertDeluxscore", -1747443298231505072L);
        setLongField(term273046, term273046.getClass(), "totalMasterDeluxscore", -1798223639090185181L);
        setLongField(term273046, term273046.getClass(), "totalReMasterDeluxscore", -6500788244765657865L);
        setIntField(term273046, term273046.getClass(), "totalSync", -1477832518);
        setIntField(term273046, term273046.getClass(), "totalBasicSync", 1121488723);
        setIntField(term273046, term273046.getClass(), "totalAdvancedSync", 1759141083);
        setIntField(term273046, term273046.getClass(), "totalExpertSync", -1193541067);
        setIntField(term273046, term273046.getClass(), "totalMasterSync", 1034000306);
        setIntField(term273046, term273046.getClass(), "totalReMasterSync", 408585174);
        setLongField(term273046, term273046.getClass(), "totalAchievement", 8875253983186168342L);
        setLongField(term273046, term273046.getClass(), "totalBasicAchievement", -6537192025206220818L);
        setLongField(term273046, term273046.getClass(), "totalAdvancedAchievement", -6275459208179396254L);
        setLongField(term273046, term273046.getClass(), "totalExpertAchievement", 4054437225519191923L);
        setLongField(term273046, term273046.getClass(), "totalMasterAchievement", 1724768287125313467L);
        setLongField(term273046, term273046.getClass(), "totalReMasterAchievement", -6655078218696757936L);
        setLongField(term273046, term273046.getClass(), "playerOldRating", -3669366046389564408L);
        setLongField(term273046, term273046.getClass(), "playerNewRating", 9114853101740999739L);
        setIntField(term273046, term273046.getClass(), "banState", -408891900);
        setLongField(term273046, term273046.getClass(), "dateTime", -5169348158002438805L);
        term273407 = new Long(8765390636999815296L);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.maimai2.model.userdata.UserDetail");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = long.class;
        Object[] args = new Object[1];
        args[0] = term273407;
        callMethod(klass, "setTotalMasterDeluxscore", argTypes, term273046, args);
    }

};


