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

public class UserDetail_setLastPlayDate_733446483104 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term254626;

    public UserDetail_setLastPlayDate_733446483104() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Long term254630 = new Long(-2195794659127490022L);
        Integer term254693 = new Integer(795184090);
        Integer term254695 = new Integer(1181730734);
        Integer term254697 = new Integer(-668958857);
        ArrayList term254691 = new ArrayList();
        ((ArrayList) term254691).add(term254693);
        ((ArrayList) term254691).add(term254695);
        ((ArrayList) term254691).add(term254697);
        ArrayList term254701 = new ArrayList();
        term254626 = newInstance(Class.forName("icu.samnyan.aqua.sega.maimai2.model.userdata.UserDetail"));
        Object term254628 = newInstance(Class.forName("icu.samnyan.aqua.sega.general.model.Card"));
        Object term254644 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term254645 = newInstance(Class.forName("java.time.LocalDate"));
        Object term254649 = newInstance(Class.forName("java.time.LocalTime"));
        Object term254654 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term254655 = newInstance(Class.forName("java.time.LocalDate"));
        Object term254659 = newInstance(Class.forName("java.time.LocalTime"));
        setLongField(term254626, term254626.getClass(), "id", 8513328321716694429L);
        setLongField(term254628, term254628.getClass(), "id", -7464605719351911598L);
        setField(term254628, term254628.getClass(), "extId", term254630);
        setField(term254628, term254628.getClass(), "luid", "yBxHnUtIkQ");
        setIntField(term254645, term254645.getClass(), "year", 2010);
        setShortField(term254645, term254645.getClass(), "month", (short) 5);
        setShortField(term254645, term254645.getClass(), "day", (short) 18);
        setField(term254644, term254644.getClass(), "date", term254645);
        setByteField(term254649, term254649.getClass(), "hour", (byte) 8);
        setByteField(term254649, term254649.getClass(), "minute", (byte) 4);
        setByteField(term254649, term254649.getClass(), "second", (byte) 37);
        setIntField(term254649, term254649.getClass(), "nano", 896333553);
        setField(term254644, term254644.getClass(), "time", term254649);
        setField(term254628, term254628.getClass(), "registerTime", term254644);
        setIntField(term254655, term254655.getClass(), "year", 2011);
        setShortField(term254655, term254655.getClass(), "month", (short) 9);
        setShortField(term254655, term254655.getClass(), "day", (short) 17);
        setField(term254654, term254654.getClass(), "date", term254655);
        setByteField(term254659, term254659.getClass(), "hour", (byte) 16);
        setByteField(term254659, term254659.getClass(), "minute", (byte) 37);
        setByteField(term254659, term254659.getClass(), "second", (byte) 45);
        setIntField(term254659, term254659.getClass(), "nano", 117475194);
        setField(term254654, term254654.getClass(), "time", term254659);
        setField(term254628, term254628.getClass(), "accessTime", term254654);
        setField(term254626, term254626.getClass(), "card", term254628);
        setField(term254626, term254626.getClass(), "userName", "qzQdYSDBmc");
        setIntField(term254626, term254626.getClass(), "isNetMember", -2084438499);
        setIntField(term254626, term254626.getClass(), "iconId", -2108733549);
        setIntField(term254626, term254626.getClass(), "plateId", -1646304288);
        setIntField(term254626, term254626.getClass(), "titleId", -1367231703);
        setIntField(term254626, term254626.getClass(), "partnerId", -1877202574);
        setIntField(term254626, term254626.getClass(), "frameId", -1675786952);
        setIntField(term254626, term254626.getClass(), "selectMapId", -1707598452);
        setIntField(term254626, term254626.getClass(), "totalAwake", -1313984720);
        setIntField(term254626, term254626.getClass(), "gradeRating", 2138390161);
        setIntField(term254626, term254626.getClass(), "musicRating", -1087119999);
        setIntField(term254626, term254626.getClass(), "playerRating", -202818613);
        setIntField(term254626, term254626.getClass(), "highestRating", -36650275);
        setIntField(term254626, term254626.getClass(), "gradeRank", -1676429754);
        setIntField(term254626, term254626.getClass(), "classRank", 1488573561);
        setIntField(term254626, term254626.getClass(), "courseRank", 1837348875);
        setField(term254626, term254626.getClass(), "charaSlot", term254691);
        setField(term254626, term254626.getClass(), "charaLockSlot", term254701);
        setLongField(term254626, term254626.getClass(), "contentBit", -6462769289689286535L);
        setIntField(term254626, term254626.getClass(), "playCount", 85617865);
        setField(term254626, term254626.getClass(), "eventWatchedDate", "lDCuOPQJTx");
        setField(term254626, term254626.getClass(), "lastGameId", "WrdCxtewLX");
        setField(term254626, term254626.getClass(), "lastRomVersion", "pVqgMvBetn");
        setField(term254626, term254626.getClass(), "lastDataVersion", "GWyDJhNjHO");
        setField(term254626, term254626.getClass(), "lastLoginDate", "wGLXibmokg");
        setField(term254626, term254626.getClass(), "lastPlayDate", "pjzfuurpjQ");
        setIntField(term254626, term254626.getClass(), "lastPlayCredit", -918971256);
        setIntField(term254626, term254626.getClass(), "lastPlayMode", 1266243966);
        setIntField(term254626, term254626.getClass(), "lastPlaceId", -1440767137);
        setField(term254626, term254626.getClass(), "lastPlaceName", "ruWiEcqbKE");
        setIntField(term254626, term254626.getClass(), "lastAllNetId", 1799592662);
        setIntField(term254626, term254626.getClass(), "lastRegionId", 198586110);
        setField(term254626, term254626.getClass(), "lastRegionName", "fOazzEjCJK");
        setField(term254626, term254626.getClass(), "lastClientId", "rQvktJLyNp");
        setField(term254626, term254626.getClass(), "lastCountryCode", "agrDiNiIaA");
        setIntField(term254626, term254626.getClass(), "lastSelectEMoney", 1369038204);
        setIntField(term254626, term254626.getClass(), "lastSelectTicket", 1877430948);
        setIntField(term254626, term254626.getClass(), "lastSelectCourse", 1302744454);
        setIntField(term254626, term254626.getClass(), "lastCountCourse", 584343492);
        setField(term254626, term254626.getClass(), "firstGameId", "WUUmlOfErB");
        setField(term254626, term254626.getClass(), "firstRomVersion", "OacYqyvsgP");
        setField(term254626, term254626.getClass(), "firstDataVersion", "ednhFNlubd");
        setField(term254626, term254626.getClass(), "firstPlayDate", "YIcytpxQpg");
        setField(term254626, term254626.getClass(), "compatibleCmVersion", "nLdiDnEtGa");
        setField(term254626, term254626.getClass(), "dailyBonusDate", "XepaExohUu");
        setField(term254626, term254626.getClass(), "dailyCourseBonusDate", "hTcLgWjgVZ");
        setField(term254626, term254626.getClass(), "lastPairLoginDate", "HJuxBeseep");
        setField(term254626, term254626.getClass(), "lastTrialPlayDate", "pJhaEHvvEJ");
        setIntField(term254626, term254626.getClass(), "playVsCount", -465954723);
        setIntField(term254626, term254626.getClass(), "playSyncCount", 182888677);
        setIntField(term254626, term254626.getClass(), "winCount", -561603446);
        setIntField(term254626, term254626.getClass(), "helpCount", 1552433262);
        setIntField(term254626, term254626.getClass(), "comboCount", -1998835264);
        setLongField(term254626, term254626.getClass(), "totalDeluxscore", -5482336455036467786L);
        setLongField(term254626, term254626.getClass(), "totalBasicDeluxscore", -3043024956068848316L);
        setLongField(term254626, term254626.getClass(), "totalAdvancedDeluxscore", 7263067701876554382L);
        setLongField(term254626, term254626.getClass(), "totalExpertDeluxscore", -2448018133476908324L);
        setLongField(term254626, term254626.getClass(), "totalMasterDeluxscore", -6908873792285341702L);
        setLongField(term254626, term254626.getClass(), "totalReMasterDeluxscore", 6347482717839895545L);
        setIntField(term254626, term254626.getClass(), "totalSync", 244982784);
        setIntField(term254626, term254626.getClass(), "totalBasicSync", 864448665);
        setIntField(term254626, term254626.getClass(), "totalAdvancedSync", -1638295220);
        setIntField(term254626, term254626.getClass(), "totalExpertSync", -1012973336);
        setIntField(term254626, term254626.getClass(), "totalMasterSync", -1370517623);
        setIntField(term254626, term254626.getClass(), "totalReMasterSync", 1773831811);
        setLongField(term254626, term254626.getClass(), "totalAchievement", -2624145896031943297L);
        setLongField(term254626, term254626.getClass(), "totalBasicAchievement", -2004130012269218231L);
        setLongField(term254626, term254626.getClass(), "totalAdvancedAchievement", 4318611076179419586L);
        setLongField(term254626, term254626.getClass(), "totalExpertAchievement", -7176385973637175332L);
        setLongField(term254626, term254626.getClass(), "totalMasterAchievement", 2352484202622355603L);
        setLongField(term254626, term254626.getClass(), "totalReMasterAchievement", 8344251433001848514L);
        setLongField(term254626, term254626.getClass(), "playerOldRating", -5979153345613880019L);
        setLongField(term254626, term254626.getClass(), "playerNewRating", -4791862808610720014L);
        setIntField(term254626, term254626.getClass(), "banState", -789958417);
        setLongField(term254626, term254626.getClass(), "dateTime", -7075684720903732037L);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.maimai2.model.userdata.UserDetail");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.String");
        Object[] args = new Object[1];
        args[0] = "uUawepHlyb";
        callMethod(klass, "setLastPlayDate", argTypes, term254626, args);
    }

};


