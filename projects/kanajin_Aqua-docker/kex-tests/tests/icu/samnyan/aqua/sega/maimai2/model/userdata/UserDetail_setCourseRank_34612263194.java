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

public class UserDetail_setCourseRank_34612263194 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term4282908;
     Object term4283265;

    public UserDetail_setCourseRank_34612263194() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Long term4282912 = new Long(-1638779219901812994L);
        Integer term4282975 = new Integer(682498319);
        ArrayList term4282973 = new ArrayList();
        ((ArrayList) term4282973).add(term4282975);
        Integer term4282981 = new Integer(1946906465);
        Integer term4282983 = new Integer(470334030);
        Integer term4282985 = new Integer(1448241621);
        Integer term4282987 = new Integer(-2062261648);
        Integer term4282989 = new Integer(-1535392729);
        Integer term4282991 = new Integer(-802647375);
        Integer term4282993 = new Integer(1588240428);
        Integer term4282995 = new Integer(118743812);
        ArrayList term4282979 = new ArrayList();
        ((ArrayList) term4282979).add(term4282981);
        ((ArrayList) term4282979).add(term4282983);
        ((ArrayList) term4282979).add(term4282985);
        ((ArrayList) term4282979).add(term4282987);
        ((ArrayList) term4282979).add(term4282989);
        ((ArrayList) term4282979).add(term4282991);
        ((ArrayList) term4282979).add(term4282993);
        ((ArrayList) term4282979).add(term4282995);
        term4282908 = newInstance(Class.forName("icu.samnyan.aqua.sega.maimai2.model.userdata.UserDetail"));
        Object term4282910 = newInstance(Class.forName("icu.samnyan.aqua.sega.general.model.Card"));
        Object term4282926 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term4282927 = newInstance(Class.forName("java.time.LocalDate"));
        Object term4282931 = newInstance(Class.forName("java.time.LocalTime"));
        Object term4282936 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term4282937 = newInstance(Class.forName("java.time.LocalDate"));
        Object term4282941 = newInstance(Class.forName("java.time.LocalTime"));
        setLongField(term4282908, term4282908.getClass(), "id", 331309160219079473L);
        setLongField(term4282910, term4282910.getClass(), "id", -2408542224817502666L);
        setField(term4282910, term4282910.getClass(), "extId", term4282912);
        setField(term4282910, term4282910.getClass(), "luid", "azqyNAXwVP");
        setIntField(term4282927, term4282927.getClass(), "year", 2025);
        setShortField(term4282927, term4282927.getClass(), "month", (short) 6);
        setShortField(term4282927, term4282927.getClass(), "day", (short) 30);
        setField(term4282926, term4282926.getClass(), "date", term4282927);
        setByteField(term4282931, term4282931.getClass(), "hour", (byte) 2);
        setByteField(term4282931, term4282931.getClass(), "minute", (byte) 46);
        setByteField(term4282931, term4282931.getClass(), "second", (byte) 52);
        setIntField(term4282931, term4282931.getClass(), "nano", 489322565);
        setField(term4282926, term4282926.getClass(), "time", term4282931);
        setField(term4282910, term4282910.getClass(), "registerTime", term4282926);
        setIntField(term4282937, term4282937.getClass(), "year", 2017);
        setShortField(term4282937, term4282937.getClass(), "month", (short) 5);
        setShortField(term4282937, term4282937.getClass(), "day", (short) 6);
        setField(term4282936, term4282936.getClass(), "date", term4282937);
        setByteField(term4282941, term4282941.getClass(), "hour", (byte) 5);
        setByteField(term4282941, term4282941.getClass(), "minute", (byte) 44);
        setByteField(term4282941, term4282941.getClass(), "second", (byte) 47);
        setIntField(term4282941, term4282941.getClass(), "nano", 401837419);
        setField(term4282936, term4282936.getClass(), "time", term4282941);
        setField(term4282910, term4282910.getClass(), "accessTime", term4282936);
        setField(term4282908, term4282908.getClass(), "card", term4282910);
        setField(term4282908, term4282908.getClass(), "userName", "JELnlRingn");
        setIntField(term4282908, term4282908.getClass(), "isNetMember", 1863772649);
        setIntField(term4282908, term4282908.getClass(), "iconId", 53728772);
        setIntField(term4282908, term4282908.getClass(), "plateId", 615560796);
        setIntField(term4282908, term4282908.getClass(), "titleId", 1993309901);
        setIntField(term4282908, term4282908.getClass(), "partnerId", 737099592);
        setIntField(term4282908, term4282908.getClass(), "frameId", 805116041);
        setIntField(term4282908, term4282908.getClass(), "selectMapId", 92168235);
        setIntField(term4282908, term4282908.getClass(), "totalAwake", 1237784490);
        setIntField(term4282908, term4282908.getClass(), "gradeRating", -542087889);
        setIntField(term4282908, term4282908.getClass(), "musicRating", -1376953351);
        setIntField(term4282908, term4282908.getClass(), "playerRating", 1038103592);
        setIntField(term4282908, term4282908.getClass(), "highestRating", 1285141847);
        setIntField(term4282908, term4282908.getClass(), "gradeRank", 977910774);
        setIntField(term4282908, term4282908.getClass(), "classRank", 1239805088);
        setIntField(term4282908, term4282908.getClass(), "courseRank", -1618628021);
        setField(term4282908, term4282908.getClass(), "charaSlot", term4282973);
        setField(term4282908, term4282908.getClass(), "charaLockSlot", term4282979);
        setLongField(term4282908, term4282908.getClass(), "contentBit", 2486203555942527640L);
        setIntField(term4282908, term4282908.getClass(), "playCount", 475668074);
        setField(term4282908, term4282908.getClass(), "eventWatchedDate", "oYwxuFWPEy");
        setField(term4282908, term4282908.getClass(), "lastGameId", "rCuotgVGYN");
        setField(term4282908, term4282908.getClass(), "lastRomVersion", "pBphgyRlwO");
        setField(term4282908, term4282908.getClass(), "lastDataVersion", "tQLXNmIheq");
        setField(term4282908, term4282908.getClass(), "lastLoginDate", "RJsaEZZJnW");
        setField(term4282908, term4282908.getClass(), "lastPlayDate", "mCdkgcOHix");
        setIntField(term4282908, term4282908.getClass(), "lastPlayCredit", -898634266);
        setIntField(term4282908, term4282908.getClass(), "lastPlayMode", -296247621);
        setIntField(term4282908, term4282908.getClass(), "lastPlaceId", 1313143747);
        setField(term4282908, term4282908.getClass(), "lastPlaceName", "LTxhMdUjLl");
        setIntField(term4282908, term4282908.getClass(), "lastAllNetId", -1396619283);
        setIntField(term4282908, term4282908.getClass(), "lastRegionId", 1427371991);
        setField(term4282908, term4282908.getClass(), "lastRegionName", "nLTAYiNvHX");
        setField(term4282908, term4282908.getClass(), "lastClientId", "qrbZtlETgi");
        setField(term4282908, term4282908.getClass(), "lastCountryCode", "TwHncyVGJk");
        setIntField(term4282908, term4282908.getClass(), "lastSelectEMoney", 31773775);
        setIntField(term4282908, term4282908.getClass(), "lastSelectTicket", -742144450);
        setIntField(term4282908, term4282908.getClass(), "lastSelectCourse", -1403190960);
        setIntField(term4282908, term4282908.getClass(), "lastCountCourse", -2001758183);
        setField(term4282908, term4282908.getClass(), "firstGameId", "loJlNEDVtC");
        setField(term4282908, term4282908.getClass(), "firstRomVersion", "ZwSOMGFQXF");
        setField(term4282908, term4282908.getClass(), "firstDataVersion", "bzwecGXHWm");
        setField(term4282908, term4282908.getClass(), "firstPlayDate", "bmIUenTsxk");
        setField(term4282908, term4282908.getClass(), "compatibleCmVersion", "AWtGXZoOJd");
        setField(term4282908, term4282908.getClass(), "dailyBonusDate", "glaTHgWkog");
        setField(term4282908, term4282908.getClass(), "dailyCourseBonusDate", "KGaldrczuU");
        setField(term4282908, term4282908.getClass(), "lastPairLoginDate", "himDZXLScY");
        setField(term4282908, term4282908.getClass(), "lastTrialPlayDate", "czbtadiONU");
        setIntField(term4282908, term4282908.getClass(), "playVsCount", 1555926069);
        setIntField(term4282908, term4282908.getClass(), "playSyncCount", -1952071833);
        setIntField(term4282908, term4282908.getClass(), "winCount", 2003364769);
        setIntField(term4282908, term4282908.getClass(), "helpCount", 1303332759);
        setIntField(term4282908, term4282908.getClass(), "comboCount", -1597714823);
        setLongField(term4282908, term4282908.getClass(), "totalDeluxscore", -1333295434315956460L);
        setLongField(term4282908, term4282908.getClass(), "totalBasicDeluxscore", -7569203788345605314L);
        setLongField(term4282908, term4282908.getClass(), "totalAdvancedDeluxscore", 9177117303142569314L);
        setLongField(term4282908, term4282908.getClass(), "totalExpertDeluxscore", -5899868073168087559L);
        setLongField(term4282908, term4282908.getClass(), "totalMasterDeluxscore", 611451209871536707L);
        setLongField(term4282908, term4282908.getClass(), "totalReMasterDeluxscore", -7397947815142984701L);
        setIntField(term4282908, term4282908.getClass(), "totalSync", -2143345488);
        setIntField(term4282908, term4282908.getClass(), "totalBasicSync", 1692610553);
        setIntField(term4282908, term4282908.getClass(), "totalAdvancedSync", -14671559);
        setIntField(term4282908, term4282908.getClass(), "totalExpertSync", -1582298651);
        setIntField(term4282908, term4282908.getClass(), "totalMasterSync", -1972202671);
        setIntField(term4282908, term4282908.getClass(), "totalReMasterSync", -594433735);
        setLongField(term4282908, term4282908.getClass(), "totalAchievement", 1013456363053034105L);
        setLongField(term4282908, term4282908.getClass(), "totalBasicAchievement", -3185954678562129663L);
        setLongField(term4282908, term4282908.getClass(), "totalAdvancedAchievement", 7681793224098640394L);
        setLongField(term4282908, term4282908.getClass(), "totalExpertAchievement", -2799837196215654079L);
        setLongField(term4282908, term4282908.getClass(), "totalMasterAchievement", -184894301900216800L);
        setLongField(term4282908, term4282908.getClass(), "totalReMasterAchievement", -6466072679011309501L);
        setLongField(term4282908, term4282908.getClass(), "playerOldRating", 2497491414439317808L);
        setLongField(term4282908, term4282908.getClass(), "playerNewRating", -7579250208168881286L);
        setIntField(term4282908, term4282908.getClass(), "banState", -129344630);
        setLongField(term4282908, term4282908.getClass(), "dateTime", 1368867143110643039L);
        term4283265 = new Integer(-733595944);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.maimai2.model.userdata.UserDetail");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = int.class;
        Object[] args = new Object[1];
        args[0] = term4283265;
        callMethod(klass, "setCourseRank", argTypes, term4282908, args);
    }

};


