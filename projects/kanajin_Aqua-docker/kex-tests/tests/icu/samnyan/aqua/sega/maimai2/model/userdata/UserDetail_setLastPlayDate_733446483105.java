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

public class UserDetail_setLastPlayDate_733446483105 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term254681;

    public UserDetail_setLastPlayDate_733446483105() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Long term254685 = new Long(-2195794659127490022L);
        Integer term254748 = new Integer(795184090);
        Integer term254750 = new Integer(1181730734);
        Integer term254752 = new Integer(-668958857);
        ArrayList term254746 = new ArrayList();
        ((ArrayList) term254746).add(term254748);
        ((ArrayList) term254746).add(term254750);
        ((ArrayList) term254746).add(term254752);
        ArrayList term254756 = new ArrayList();
        term254681 = newInstance(Class.forName("icu.samnyan.aqua.sega.maimai2.model.userdata.UserDetail"));
        Object term254683 = newInstance(Class.forName("icu.samnyan.aqua.sega.general.model.Card"));
        Object term254699 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term254700 = newInstance(Class.forName("java.time.LocalDate"));
        Object term254704 = newInstance(Class.forName("java.time.LocalTime"));
        Object term254709 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term254710 = newInstance(Class.forName("java.time.LocalDate"));
        Object term254714 = newInstance(Class.forName("java.time.LocalTime"));
        setLongField(term254681, term254681.getClass(), "id", 8513328321716694429L);
        setLongField(term254683, term254683.getClass(), "id", -7464605719351911598L);
        setField(term254683, term254683.getClass(), "extId", term254685);
        setField(term254683, term254683.getClass(), "luid", "yBxHnUtIkQ");
        setIntField(term254700, term254700.getClass(), "year", 2010);
        setShortField(term254700, term254700.getClass(), "month", (short) 5);
        setShortField(term254700, term254700.getClass(), "day", (short) 18);
        setField(term254699, term254699.getClass(), "date", term254700);
        setByteField(term254704, term254704.getClass(), "hour", (byte) 8);
        setByteField(term254704, term254704.getClass(), "minute", (byte) 4);
        setByteField(term254704, term254704.getClass(), "second", (byte) 37);
        setIntField(term254704, term254704.getClass(), "nano", 896333553);
        setField(term254699, term254699.getClass(), "time", term254704);
        setField(term254683, term254683.getClass(), "registerTime", term254699);
        setIntField(term254710, term254710.getClass(), "year", 2011);
        setShortField(term254710, term254710.getClass(), "month", (short) 9);
        setShortField(term254710, term254710.getClass(), "day", (short) 17);
        setField(term254709, term254709.getClass(), "date", term254710);
        setByteField(term254714, term254714.getClass(), "hour", (byte) 16);
        setByteField(term254714, term254714.getClass(), "minute", (byte) 37);
        setByteField(term254714, term254714.getClass(), "second", (byte) 45);
        setIntField(term254714, term254714.getClass(), "nano", 117475194);
        setField(term254709, term254709.getClass(), "time", term254714);
        setField(term254683, term254683.getClass(), "accessTime", term254709);
        setField(term254681, term254681.getClass(), "card", term254683);
        setField(term254681, term254681.getClass(), "userName", "qzQdYSDBmc");
        setIntField(term254681, term254681.getClass(), "isNetMember", -2084438499);
        setIntField(term254681, term254681.getClass(), "iconId", -2108733549);
        setIntField(term254681, term254681.getClass(), "plateId", -1646304288);
        setIntField(term254681, term254681.getClass(), "titleId", -1367231703);
        setIntField(term254681, term254681.getClass(), "partnerId", -1877202574);
        setIntField(term254681, term254681.getClass(), "frameId", -1675786952);
        setIntField(term254681, term254681.getClass(), "selectMapId", -1707598452);
        setIntField(term254681, term254681.getClass(), "totalAwake", -1313984720);
        setIntField(term254681, term254681.getClass(), "gradeRating", 2138390161);
        setIntField(term254681, term254681.getClass(), "musicRating", -1087119999);
        setIntField(term254681, term254681.getClass(), "playerRating", -202818613);
        setIntField(term254681, term254681.getClass(), "highestRating", -36650275);
        setIntField(term254681, term254681.getClass(), "gradeRank", -1676429754);
        setIntField(term254681, term254681.getClass(), "classRank", 1488573561);
        setIntField(term254681, term254681.getClass(), "courseRank", 1837348875);
        setField(term254681, term254681.getClass(), "charaSlot", term254746);
        setField(term254681, term254681.getClass(), "charaLockSlot", term254756);
        setLongField(term254681, term254681.getClass(), "contentBit", -6462769289689286535L);
        setIntField(term254681, term254681.getClass(), "playCount", 85617865);
        setField(term254681, term254681.getClass(), "eventWatchedDate", "lDCuOPQJTx");
        setField(term254681, term254681.getClass(), "lastGameId", "WrdCxtewLX");
        setField(term254681, term254681.getClass(), "lastRomVersion", "pVqgMvBetn");
        setField(term254681, term254681.getClass(), "lastDataVersion", "GWyDJhNjHO");
        setField(term254681, term254681.getClass(), "lastLoginDate", "wGLXibmokg");
        setField(term254681, term254681.getClass(), "lastPlayDate", "pjzfuurpjQ");
        setIntField(term254681, term254681.getClass(), "lastPlayCredit", -918971256);
        setIntField(term254681, term254681.getClass(), "lastPlayMode", 1266243966);
        setIntField(term254681, term254681.getClass(), "lastPlaceId", -1440767137);
        setField(term254681, term254681.getClass(), "lastPlaceName", "ruWiEcqbKE");
        setIntField(term254681, term254681.getClass(), "lastAllNetId", 1799592662);
        setIntField(term254681, term254681.getClass(), "lastRegionId", 198586110);
        setField(term254681, term254681.getClass(), "lastRegionName", "fOazzEjCJK");
        setField(term254681, term254681.getClass(), "lastClientId", "rQvktJLyNp");
        setField(term254681, term254681.getClass(), "lastCountryCode", "agrDiNiIaA");
        setIntField(term254681, term254681.getClass(), "lastSelectEMoney", 1369038204);
        setIntField(term254681, term254681.getClass(), "lastSelectTicket", 1877430948);
        setIntField(term254681, term254681.getClass(), "lastSelectCourse", 1302744454);
        setIntField(term254681, term254681.getClass(), "lastCountCourse", 584343492);
        setField(term254681, term254681.getClass(), "firstGameId", "WUUmlOfErB");
        setField(term254681, term254681.getClass(), "firstRomVersion", "OacYqyvsgP");
        setField(term254681, term254681.getClass(), "firstDataVersion", "ednhFNlubd");
        setField(term254681, term254681.getClass(), "firstPlayDate", "YIcytpxQpg");
        setField(term254681, term254681.getClass(), "compatibleCmVersion", "nLdiDnEtGa");
        setField(term254681, term254681.getClass(), "dailyBonusDate", "XepaExohUu");
        setField(term254681, term254681.getClass(), "dailyCourseBonusDate", "hTcLgWjgVZ");
        setField(term254681, term254681.getClass(), "lastPairLoginDate", "HJuxBeseep");
        setField(term254681, term254681.getClass(), "lastTrialPlayDate", "pJhaEHvvEJ");
        setIntField(term254681, term254681.getClass(), "playVsCount", -465954723);
        setIntField(term254681, term254681.getClass(), "playSyncCount", 182888677);
        setIntField(term254681, term254681.getClass(), "winCount", -561603446);
        setIntField(term254681, term254681.getClass(), "helpCount", 1552433262);
        setIntField(term254681, term254681.getClass(), "comboCount", -1998835264);
        setLongField(term254681, term254681.getClass(), "totalDeluxscore", -5482336455036467786L);
        setLongField(term254681, term254681.getClass(), "totalBasicDeluxscore", -3043024956068848316L);
        setLongField(term254681, term254681.getClass(), "totalAdvancedDeluxscore", 7263067701876554382L);
        setLongField(term254681, term254681.getClass(), "totalExpertDeluxscore", -2448018133476908324L);
        setLongField(term254681, term254681.getClass(), "totalMasterDeluxscore", -6908873792285341702L);
        setLongField(term254681, term254681.getClass(), "totalReMasterDeluxscore", 6347482717839895545L);
        setIntField(term254681, term254681.getClass(), "totalSync", 244982784);
        setIntField(term254681, term254681.getClass(), "totalBasicSync", 864448665);
        setIntField(term254681, term254681.getClass(), "totalAdvancedSync", -1638295220);
        setIntField(term254681, term254681.getClass(), "totalExpertSync", -1012973336);
        setIntField(term254681, term254681.getClass(), "totalMasterSync", -1370517623);
        setIntField(term254681, term254681.getClass(), "totalReMasterSync", 1773831811);
        setLongField(term254681, term254681.getClass(), "totalAchievement", -2624145896031943297L);
        setLongField(term254681, term254681.getClass(), "totalBasicAchievement", -2004130012269218231L);
        setLongField(term254681, term254681.getClass(), "totalAdvancedAchievement", 4318611076179419586L);
        setLongField(term254681, term254681.getClass(), "totalExpertAchievement", -7176385973637175332L);
        setLongField(term254681, term254681.getClass(), "totalMasterAchievement", 2352484202622355603L);
        setLongField(term254681, term254681.getClass(), "totalReMasterAchievement", 8344251433001848514L);
        setLongField(term254681, term254681.getClass(), "playerOldRating", -5979153345613880019L);
        setLongField(term254681, term254681.getClass(), "playerNewRating", -4791862808610720014L);
        setIntField(term254681, term254681.getClass(), "banState", -789958417);
        setLongField(term254681, term254681.getClass(), "dateTime", -7075684720903732037L);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.maimai2.model.userdata.UserDetail");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.String");
        Object[] args = new Object[1];
        args[0] = "uUawepHlyb";
        callMethod(klass, "setLastPlayDate", argTypes, term254681, args);
    }

};


