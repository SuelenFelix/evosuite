package icu.samnyan.aqua.sega.maimai.model.userdata;

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
import static icu.samnyan.aqua.sega.maimai.model.userdata.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.lang.Object;
import java.lang.Long;

public class UserWebOption_hashCode_118796646719 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term42701;

    public UserWebOption_hashCode_118796646719() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Long term42707 = new Long(-3948863953565024517L);
        term42701 = newInstance(Class.forName("icu.samnyan.aqua.sega.maimai.model.userdata.UserWebOption"));
        Object term42703 = newInstance(Class.forName("icu.samnyan.aqua.sega.maimai.model.userdata.UserData"));
        Object term42705 = newInstance(Class.forName("icu.samnyan.aqua.sega.general.model.Card"));
        Object term42721 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term42722 = newInstance(Class.forName("java.time.LocalDate"));
        Object term42726 = newInstance(Class.forName("java.time.LocalTime"));
        Object term42731 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term42732 = newInstance(Class.forName("java.time.LocalDate"));
        Object term42736 = newInstance(Class.forName("java.time.LocalTime"));
        setLongField(term42701, term42701.getClass(), "id", 7800835025296877231L);
        setLongField(term42703, term42703.getClass(), "id", -187772971269812453L);
        setLongField(term42705, term42705.getClass(), "id", 468487103823886117L);
        setField(term42705, term42705.getClass(), "extId", term42707);
        setField(term42705, term42705.getClass(), "luid", "HUtbHklGel");
        setIntField(term42722, term42722.getClass(), "year", 2023);
        setShortField(term42722, term42722.getClass(), "month", (short) 11);
        setShortField(term42722, term42722.getClass(), "day", (short) 8);
        setField(term42721, term42721.getClass(), "date", term42722);
        setByteField(term42726, term42726.getClass(), "hour", (byte) 21);
        setByteField(term42726, term42726.getClass(), "minute", (byte) 57);
        setByteField(term42726, term42726.getClass(), "second", (byte) 28);
        setIntField(term42726, term42726.getClass(), "nano", 426944685);
        setField(term42721, term42721.getClass(), "time", term42726);
        setField(term42705, term42705.getClass(), "registerTime", term42721);
        setIntField(term42732, term42732.getClass(), "year", 2020);
        setShortField(term42732, term42732.getClass(), "month", (short) 9);
        setShortField(term42732, term42732.getClass(), "day", (short) 2);
        setField(term42731, term42731.getClass(), "date", term42732);
        setByteField(term42736, term42736.getClass(), "hour", (byte) 17);
        setByteField(term42736, term42736.getClass(), "minute", (byte) 47);
        setByteField(term42736, term42736.getClass(), "second", (byte) 32);
        setIntField(term42736, term42736.getClass(), "nano", 161829485);
        setField(term42731, term42731.getClass(), "time", term42736);
        setField(term42705, term42705.getClass(), "accessTime", term42731);
        setField(term42703, term42703.getClass(), "card", term42705);
        setIntField(term42703, term42703.getClass(), "lastDataVersion", -1024380992);
        setField(term42703, term42703.getClass(), "userName", "QbfKDAwhSB");
        setIntField(term42703, term42703.getClass(), "point", 274867099);
        setIntField(term42703, term42703.getClass(), "totalPoint", -1432735615);
        setIntField(term42703, term42703.getClass(), "iconId", 472705336);
        setIntField(term42703, term42703.getClass(), "nameplateId", 988659735);
        setIntField(term42703, term42703.getClass(), "frameId", 1481448478);
        setIntField(term42703, term42703.getClass(), "trophyId", 598259983);
        setIntField(term42703, term42703.getClass(), "playCount", 283054332);
        setIntField(term42703, term42703.getClass(), "playVsCount", 627879820);
        setIntField(term42703, term42703.getClass(), "playSyncCount", -40238432);
        setIntField(term42703, term42703.getClass(), "winCount", -263665532);
        setIntField(term42703, term42703.getClass(), "helpCount", -662026247);
        setIntField(term42703, term42703.getClass(), "comboCount", -549576351);
        setIntField(term42703, term42703.getClass(), "feverCount", 903450678);
        setIntField(term42703, term42703.getClass(), "totalHiScore", -923344894);
        setIntField(term42703, term42703.getClass(), "totalEasyHighScore", 1165279948);
        setIntField(term42703, term42703.getClass(), "totalBasicHighScore", 842516803);
        setIntField(term42703, term42703.getClass(), "totalAdvancedHighScore", -1562310043);
        setIntField(term42703, term42703.getClass(), "totalExpertHighScore", 57936993);
        setIntField(term42703, term42703.getClass(), "totalMasterHighScore", -1963541241);
        setIntField(term42703, term42703.getClass(), "totalReMasterHighScore", 148495350);
        setIntField(term42703, term42703.getClass(), "totalHighSync", 258478328);
        setIntField(term42703, term42703.getClass(), "totalEasySync", 1079181683);
        setIntField(term42703, term42703.getClass(), "totalBasicSync", 62795043);
        setIntField(term42703, term42703.getClass(), "totalAdvancedSync", 700442161);
        setIntField(term42703, term42703.getClass(), "totalExpertSync", 1901393171);
        setIntField(term42703, term42703.getClass(), "totalMasterSync", -1708841585);
        setIntField(term42703, term42703.getClass(), "totalReMasterSync", -704298059);
        setIntField(term42703, term42703.getClass(), "playerRating", 1963830726);
        setIntField(term42703, term42703.getClass(), "highestRating", -1467028089);
        setIntField(term42703, term42703.getClass(), "rankAuthTailId", -714190515);
        setField(term42703, term42703.getClass(), "eventWatchedDate", "ckTRHEIcCK");
        setField(term42703, term42703.getClass(), "webLimitDate", "NYSBqIpNlD");
        setIntField(term42703, term42703.getClass(), "challengeTrackPhase", 492120544);
        setIntField(term42703, term42703.getClass(), "firstPlayBits", -832143098);
        setField(term42703, term42703.getClass(), "lastPlayDate", "OWglDUWQYb");
        setIntField(term42703, term42703.getClass(), "lastPlaceId", 919518312);
        setField(term42703, term42703.getClass(), "lastPlaceName", "FiqETbKjpv");
        setIntField(term42703, term42703.getClass(), "lastRegionId", 363743117);
        setField(term42703, term42703.getClass(), "lastRegionName", "FxXtdhhXyS");
        setField(term42703, term42703.getClass(), "lastClientId", "HxCEzaCcgj");
        setField(term42703, term42703.getClass(), "lastCountryCode", "PDYPOQncAB");
        setIntField(term42703, term42703.getClass(), "eventPoint", -1659784438);
        setIntField(term42703, term42703.getClass(), "totalLv", -1912629150);
        setIntField(term42703, term42703.getClass(), "lastLoginBonusDay", 593205725);
        setIntField(term42703, term42703.getClass(), "lastSurvivalBonusDay", -482661954);
        setIntField(term42703, term42703.getClass(), "loginBonusLv", -1449003566);
        setField(term42701, term42701.getClass(), "user", term42703);
        setBooleanField(term42701, term42701.getClass(), "isNetMember", true);
        setIntField(term42701, term42701.getClass(), "dispRate", -649826731);
        setIntField(term42701, term42701.getClass(), "dispJudgeStyle", 506165302);
        setIntField(term42701, term42701.getClass(), "dispRank", 932736092);
        setIntField(term42701, term42701.getClass(), "dispHomeRanker", 1792344129);
        setIntField(term42701, term42701.getClass(), "dispTotalLv", -1718734463);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.maimai.model.userdata.UserWebOption");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "hashCode", argTypes, term42701, args);
    }

};


