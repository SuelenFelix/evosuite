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

public class UserGeneralData_toString_127976256412 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term140128;

    public UserGeneralData_toString_127976256412() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Long term140134 = new Long(3238645206498300107L);
        ArrayList term140195 = new ArrayList();
        Integer term140201 = new Integer(1966881264);
        Integer term140203 = new Integer(-1707655562);
        Integer term140205 = new Integer(1525815085);
        ArrayList term140199 = new ArrayList();
        ((ArrayList) term140199).add(term140201);
        ((ArrayList) term140199).add(term140203);
        ((ArrayList) term140199).add(term140205);
        term140128 = newInstance(Class.forName("icu.samnyan.aqua.sega.maimai2.model.userdata.UserGeneralData"));
        Object term140130 = newInstance(Class.forName("icu.samnyan.aqua.sega.maimai2.model.userdata.UserDetail"));
        Object term140132 = newInstance(Class.forName("icu.samnyan.aqua.sega.general.model.Card"));
        Object term140148 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term140149 = newInstance(Class.forName("java.time.LocalDate"));
        Object term140153 = newInstance(Class.forName("java.time.LocalTime"));
        Object term140158 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term140159 = newInstance(Class.forName("java.time.LocalDate"));
        Object term140163 = newInstance(Class.forName("java.time.LocalTime"));
        setLongField(term140128, term140128.getClass(), "id", 3836862422152000358L);
        setLongField(term140130, term140130.getClass(), "id", 2979885618631780227L);
        setLongField(term140132, term140132.getClass(), "id", -1040543263100611755L);
        setField(term140132, term140132.getClass(), "extId", term140134);
        setField(term140132, term140132.getClass(), "luid", "LbApweKHaq");
        setIntField(term140149, term140149.getClass(), "year", 2014);
        setShortField(term140149, term140149.getClass(), "month", (short) 5);
        setShortField(term140149, term140149.getClass(), "day", (short) 5);
        setField(term140148, term140148.getClass(), "date", term140149);
        setByteField(term140153, term140153.getClass(), "hour", (byte) 17);
        setByteField(term140153, term140153.getClass(), "minute", (byte) 28);
        setByteField(term140153, term140153.getClass(), "second", (byte) 52);
        setIntField(term140153, term140153.getClass(), "nano", 741253436);
        setField(term140148, term140148.getClass(), "time", term140153);
        setField(term140132, term140132.getClass(), "registerTime", term140148);
        setIntField(term140159, term140159.getClass(), "year", 2015);
        setShortField(term140159, term140159.getClass(), "month", (short) 3);
        setShortField(term140159, term140159.getClass(), "day", (short) 23);
        setField(term140158, term140158.getClass(), "date", term140159);
        setByteField(term140163, term140163.getClass(), "hour", (byte) 7);
        setByteField(term140163, term140163.getClass(), "minute", (byte) 27);
        setByteField(term140163, term140163.getClass(), "second", (byte) 38);
        setIntField(term140163, term140163.getClass(), "nano", 467385263);
        setField(term140158, term140158.getClass(), "time", term140163);
        setField(term140132, term140132.getClass(), "accessTime", term140158);
        setField(term140130, term140130.getClass(), "card", term140132);
        setField(term140130, term140130.getClass(), "userName", "CvaVsebeSp");
        setIntField(term140130, term140130.getClass(), "isNetMember", 68487577);
        setIntField(term140130, term140130.getClass(), "iconId", 225702811);
        setIntField(term140130, term140130.getClass(), "plateId", 243703890);
        setIntField(term140130, term140130.getClass(), "titleId", -2015558089);
        setIntField(term140130, term140130.getClass(), "partnerId", -1965545269);
        setIntField(term140130, term140130.getClass(), "frameId", -1898898123);
        setIntField(term140130, term140130.getClass(), "selectMapId", 499139452);
        setIntField(term140130, term140130.getClass(), "totalAwake", -471563064);
        setIntField(term140130, term140130.getClass(), "gradeRating", -1803846804);
        setIntField(term140130, term140130.getClass(), "musicRating", 1011728980);
        setIntField(term140130, term140130.getClass(), "playerRating", -1674151373);
        setIntField(term140130, term140130.getClass(), "highestRating", 2007242087);
        setIntField(term140130, term140130.getClass(), "gradeRank", 33663834);
        setIntField(term140130, term140130.getClass(), "classRank", 1194874786);
        setIntField(term140130, term140130.getClass(), "courseRank", -1495464639);
        setField(term140130, term140130.getClass(), "charaSlot", term140195);
        setField(term140130, term140130.getClass(), "charaLockSlot", term140199);
        setLongField(term140130, term140130.getClass(), "contentBit", 4584995128924595032L);
        setIntField(term140130, term140130.getClass(), "playCount", -1504462202);
        setField(term140130, term140130.getClass(), "eventWatchedDate", "sGjykeQShT");
        setField(term140130, term140130.getClass(), "lastGameId", "hnbqtTirak");
        setField(term140130, term140130.getClass(), "lastRomVersion", "xfornNGLCO");
        setField(term140130, term140130.getClass(), "lastDataVersion", "ADfzHZloSW");
        setField(term140130, term140130.getClass(), "lastLoginDate", "wIJnugNtmS");
        setField(term140130, term140130.getClass(), "lastPlayDate", "ctdWGECgpL");
        setIntField(term140130, term140130.getClass(), "lastPlayCredit", 125976040);
        setIntField(term140130, term140130.getClass(), "lastPlayMode", -666251907);
        setIntField(term140130, term140130.getClass(), "lastPlaceId", 417356870);
        setField(term140130, term140130.getClass(), "lastPlaceName", "NpOvJxLOcu");
        setIntField(term140130, term140130.getClass(), "lastAllNetId", -488295525);
        setIntField(term140130, term140130.getClass(), "lastRegionId", 2035542822);
        setField(term140130, term140130.getClass(), "lastRegionName", "VuMCtXnbbd");
        setField(term140130, term140130.getClass(), "lastClientId", "fXGAskxMPG");
        setField(term140130, term140130.getClass(), "lastCountryCode", "IRGoqHyCCH");
        setIntField(term140130, term140130.getClass(), "lastSelectEMoney", 1606668266);
        setIntField(term140130, term140130.getClass(), "lastSelectTicket", 1659642005);
        setIntField(term140130, term140130.getClass(), "lastSelectCourse", 1181466680);
        setIntField(term140130, term140130.getClass(), "lastCountCourse", 1039050085);
        setField(term140130, term140130.getClass(), "firstGameId", "UsLqohewfX");
        setField(term140130, term140130.getClass(), "firstRomVersion", "llZOjgXknR");
        setField(term140130, term140130.getClass(), "firstDataVersion", "nHkhqzmpyo");
        setField(term140130, term140130.getClass(), "firstPlayDate", "UsfMPJEJAN");
        setField(term140130, term140130.getClass(), "compatibleCmVersion", "WlleIjkKZP");
        setField(term140130, term140130.getClass(), "dailyBonusDate", "psVYDPctDq");
        setField(term140130, term140130.getClass(), "dailyCourseBonusDate", "JlSzeHQccT");
        setField(term140130, term140130.getClass(), "lastPairLoginDate", "RGbggEITDh");
        setField(term140130, term140130.getClass(), "lastTrialPlayDate", "QUvccjNkOP");
        setIntField(term140130, term140130.getClass(), "playVsCount", -1960930871);
        setIntField(term140130, term140130.getClass(), "playSyncCount", -1230284197);
        setIntField(term140130, term140130.getClass(), "winCount", -506167207);
        setIntField(term140130, term140130.getClass(), "helpCount", 1701319929);
        setIntField(term140130, term140130.getClass(), "comboCount", 753637194);
        setLongField(term140130, term140130.getClass(), "totalDeluxscore", 2759983640207349010L);
        setLongField(term140130, term140130.getClass(), "totalBasicDeluxscore", -6684114917577827963L);
        setLongField(term140130, term140130.getClass(), "totalAdvancedDeluxscore", -1358301831846391496L);
        setLongField(term140130, term140130.getClass(), "totalExpertDeluxscore", -131539669468315137L);
        setLongField(term140130, term140130.getClass(), "totalMasterDeluxscore", -637593741819001106L);
        setLongField(term140130, term140130.getClass(), "totalReMasterDeluxscore", -1906352440411933411L);
        setIntField(term140130, term140130.getClass(), "totalSync", -1087577082);
        setIntField(term140130, term140130.getClass(), "totalBasicSync", 827590140);
        setIntField(term140130, term140130.getClass(), "totalAdvancedSync", 1280674880);
        setIntField(term140130, term140130.getClass(), "totalExpertSync", -2081016929);
        setIntField(term140130, term140130.getClass(), "totalMasterSync", 345548771);
        setIntField(term140130, term140130.getClass(), "totalReMasterSync", 1092807671);
        setLongField(term140130, term140130.getClass(), "totalAchievement", 7752941586314695716L);
        setLongField(term140130, term140130.getClass(), "totalBasicAchievement", 8737756539779917691L);
        setLongField(term140130, term140130.getClass(), "totalAdvancedAchievement", -5720726444677059044L);
        setLongField(term140130, term140130.getClass(), "totalExpertAchievement", -2182608618488086496L);
        setLongField(term140130, term140130.getClass(), "totalMasterAchievement", 5292581895392992812L);
        setLongField(term140130, term140130.getClass(), "totalReMasterAchievement", 4681829811089190115L);
        setLongField(term140130, term140130.getClass(), "playerOldRating", 6630507826496734913L);
        setLongField(term140130, term140130.getClass(), "playerNewRating", 5719596661545294090L);
        setIntField(term140130, term140130.getClass(), "banState", -1828014109);
        setLongField(term140130, term140130.getClass(), "dateTime", -664722832451062617L);
        setField(term140128, term140128.getClass(), "user", term140130);
        setField(term140128, term140128.getClass(), "propertyKey", "tSAXbiQHko");
        setField(term140128, term140128.getClass(), "propertyValue", "YVEDjJuvaY");
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.maimai2.model.userdata.UserGeneralData");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "toString", argTypes, term140128, args);
    }

};


