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

public class UserCourse_setId_213762302315 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term80691;
     Object term81102;

    public UserCourse_setId_213762302315() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Long term80697 = new Long(-1804015692891701666L);
        Integer term80760 = new Integer(-1174440096);
        Integer term80762 = new Integer(-679614653);
        Integer term80764 = new Integer(-561851867);
        Integer term80766 = new Integer(-1809928454);
        Integer term80768 = new Integer(-191639503);
        ArrayList term80758 = new ArrayList();
        ((ArrayList) term80758).add(term80760);
        ((ArrayList) term80758).add(term80762);
        ((ArrayList) term80758).add(term80764);
        ((ArrayList) term80758).add(term80766);
        ((ArrayList) term80758).add(term80768);
        Integer term80774 = new Integer(-1563700756);
        Integer term80776 = new Integer(-208314837);
        ArrayList term80772 = new ArrayList();
        ((ArrayList) term80772).add(term80774);
        ((ArrayList) term80772).add(term80776);
        term80691 = newInstance(Class.forName("icu.samnyan.aqua.sega.maimai2.model.userdata.UserCourse"));
        Object term80693 = newInstance(Class.forName("icu.samnyan.aqua.sega.maimai2.model.userdata.UserDetail"));
        Object term80695 = newInstance(Class.forName("icu.samnyan.aqua.sega.general.model.Card"));
        Object term80711 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term80712 = newInstance(Class.forName("java.time.LocalDate"));
        Object term80716 = newInstance(Class.forName("java.time.LocalTime"));
        Object term80721 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term80722 = newInstance(Class.forName("java.time.LocalDate"));
        Object term80726 = newInstance(Class.forName("java.time.LocalTime"));
        setLongField(term80691, term80691.getClass(), "id", -8607443959885285191L);
        setLongField(term80693, term80693.getClass(), "id", 5658001480414187301L);
        setLongField(term80695, term80695.getClass(), "id", -3320854059921237888L);
        setField(term80695, term80695.getClass(), "extId", term80697);
        setField(term80695, term80695.getClass(), "luid", "YQaoPDOhWH");
        setIntField(term80712, term80712.getClass(), "year", 2010);
        setShortField(term80712, term80712.getClass(), "month", (short) 5);
        setShortField(term80712, term80712.getClass(), "day", (short) 19);
        setField(term80711, term80711.getClass(), "date", term80712);
        setByteField(term80716, term80716.getClass(), "hour", (byte) 12);
        setByteField(term80716, term80716.getClass(), "minute", (byte) 17);
        setByteField(term80716, term80716.getClass(), "second", (byte) 52);
        setIntField(term80716, term80716.getClass(), "nano", 273610077);
        setField(term80711, term80711.getClass(), "time", term80716);
        setField(term80695, term80695.getClass(), "registerTime", term80711);
        setIntField(term80722, term80722.getClass(), "year", 2017);
        setShortField(term80722, term80722.getClass(), "month", (short) 4);
        setShortField(term80722, term80722.getClass(), "day", (short) 5);
        setField(term80721, term80721.getClass(), "date", term80722);
        setByteField(term80726, term80726.getClass(), "hour", (byte) 15);
        setByteField(term80726, term80726.getClass(), "minute", (byte) 9);
        setByteField(term80726, term80726.getClass(), "second", (byte) 36);
        setIntField(term80726, term80726.getClass(), "nano", 504876449);
        setField(term80721, term80721.getClass(), "time", term80726);
        setField(term80695, term80695.getClass(), "accessTime", term80721);
        setField(term80693, term80693.getClass(), "card", term80695);
        setField(term80693, term80693.getClass(), "userName", "SJPzCePrEj");
        setIntField(term80693, term80693.getClass(), "isNetMember", -976659428);
        setIntField(term80693, term80693.getClass(), "iconId", 974582816);
        setIntField(term80693, term80693.getClass(), "plateId", 1915101054);
        setIntField(term80693, term80693.getClass(), "titleId", -956240810);
        setIntField(term80693, term80693.getClass(), "partnerId", 2125391204);
        setIntField(term80693, term80693.getClass(), "frameId", -1473375595);
        setIntField(term80693, term80693.getClass(), "selectMapId", 847182213);
        setIntField(term80693, term80693.getClass(), "totalAwake", 1757624590);
        setIntField(term80693, term80693.getClass(), "gradeRating", 694012679);
        setIntField(term80693, term80693.getClass(), "musicRating", -630916471);
        setIntField(term80693, term80693.getClass(), "playerRating", -167574207);
        setIntField(term80693, term80693.getClass(), "highestRating", 1034189504);
        setIntField(term80693, term80693.getClass(), "gradeRank", 250123647);
        setIntField(term80693, term80693.getClass(), "classRank", -1818613479);
        setIntField(term80693, term80693.getClass(), "courseRank", -93031622);
        setField(term80693, term80693.getClass(), "charaSlot", term80758);
        setField(term80693, term80693.getClass(), "charaLockSlot", term80772);
        setLongField(term80693, term80693.getClass(), "contentBit", 516977411185784220L);
        setIntField(term80693, term80693.getClass(), "playCount", 1909891216);
        setField(term80693, term80693.getClass(), "eventWatchedDate", "tYasEQgFbL");
        setField(term80693, term80693.getClass(), "lastGameId", "hqURWIdULb");
        setField(term80693, term80693.getClass(), "lastRomVersion", "kWDcKMrObe");
        setField(term80693, term80693.getClass(), "lastDataVersion", "yQIuIaxdRt");
        setField(term80693, term80693.getClass(), "lastLoginDate", "mppqyavbHE");
        setField(term80693, term80693.getClass(), "lastPlayDate", "XRhNVGJlMP");
        setIntField(term80693, term80693.getClass(), "lastPlayCredit", -1231417445);
        setIntField(term80693, term80693.getClass(), "lastPlayMode", -1305887225);
        setIntField(term80693, term80693.getClass(), "lastPlaceId", 1861751365);
        setField(term80693, term80693.getClass(), "lastPlaceName", "OGvydrXtac");
        setIntField(term80693, term80693.getClass(), "lastAllNetId", 1137036889);
        setIntField(term80693, term80693.getClass(), "lastRegionId", 1607912632);
        setField(term80693, term80693.getClass(), "lastRegionName", "SaPfgULGFp");
        setField(term80693, term80693.getClass(), "lastClientId", "olLmzJWshP");
        setField(term80693, term80693.getClass(), "lastCountryCode", "VbgHjUqRYR");
        setIntField(term80693, term80693.getClass(), "lastSelectEMoney", -2089396254);
        setIntField(term80693, term80693.getClass(), "lastSelectTicket", 609444561);
        setIntField(term80693, term80693.getClass(), "lastSelectCourse", 2102660964);
        setIntField(term80693, term80693.getClass(), "lastCountCourse", 131358254);
        setField(term80693, term80693.getClass(), "firstGameId", "qZzSujRYqy");
        setField(term80693, term80693.getClass(), "firstRomVersion", "IJXeeXjhgd");
        setField(term80693, term80693.getClass(), "firstDataVersion", "QTDAUOmsVV");
        setField(term80693, term80693.getClass(), "firstPlayDate", "ODrpsXzKlX");
        setField(term80693, term80693.getClass(), "compatibleCmVersion", "xxswizwuwy");
        setField(term80693, term80693.getClass(), "dailyBonusDate", "QbkfeBvHco");
        setField(term80693, term80693.getClass(), "dailyCourseBonusDate", "lLaCGEQqCV");
        setField(term80693, term80693.getClass(), "lastPairLoginDate", "bYFQVigzOV");
        setField(term80693, term80693.getClass(), "lastTrialPlayDate", "TXKwwgcTVt");
        setIntField(term80693, term80693.getClass(), "playVsCount", -1411314076);
        setIntField(term80693, term80693.getClass(), "playSyncCount", -1465382016);
        setIntField(term80693, term80693.getClass(), "winCount", 2111238518);
        setIntField(term80693, term80693.getClass(), "helpCount", -477500403);
        setIntField(term80693, term80693.getClass(), "comboCount", 425471770);
        setLongField(term80693, term80693.getClass(), "totalDeluxscore", -7738436979075632041L);
        setLongField(term80693, term80693.getClass(), "totalBasicDeluxscore", -2179210404388147539L);
        setLongField(term80693, term80693.getClass(), "totalAdvancedDeluxscore", -9023419576773079155L);
        setLongField(term80693, term80693.getClass(), "totalExpertDeluxscore", -6945410207309729506L);
        setLongField(term80693, term80693.getClass(), "totalMasterDeluxscore", 7325191132338984037L);
        setLongField(term80693, term80693.getClass(), "totalReMasterDeluxscore", -6048008000576751518L);
        setIntField(term80693, term80693.getClass(), "totalSync", -2070314247);
        setIntField(term80693, term80693.getClass(), "totalBasicSync", -2128262129);
        setIntField(term80693, term80693.getClass(), "totalAdvancedSync", -1404754679);
        setIntField(term80693, term80693.getClass(), "totalExpertSync", 995795018);
        setIntField(term80693, term80693.getClass(), "totalMasterSync", 21168892);
        setIntField(term80693, term80693.getClass(), "totalReMasterSync", 1344518129);
        setLongField(term80693, term80693.getClass(), "totalAchievement", -2877090978001180900L);
        setLongField(term80693, term80693.getClass(), "totalBasicAchievement", 3191029552291281213L);
        setLongField(term80693, term80693.getClass(), "totalAdvancedAchievement", 3453131310882907433L);
        setLongField(term80693, term80693.getClass(), "totalExpertAchievement", -7034989140356711250L);
        setLongField(term80693, term80693.getClass(), "totalMasterAchievement", 5366539798283785414L);
        setLongField(term80693, term80693.getClass(), "totalReMasterAchievement", -5948221629490346744L);
        setLongField(term80693, term80693.getClass(), "playerOldRating", 2627983048324581551L);
        setLongField(term80693, term80693.getClass(), "playerNewRating", -4490723442670837407L);
        setIntField(term80693, term80693.getClass(), "banState", -1534477902);
        setLongField(term80693, term80693.getClass(), "dateTime", 6625707209740450857L);
        setField(term80691, term80691.getClass(), "user", term80693);
        setIntField(term80691, term80691.getClass(), "courseId", -1969746416);
        setBooleanField(term80691, term80691.getClass(), "isLastClear", true);
        setIntField(term80691, term80691.getClass(), "totalRestlife", -1506731850);
        setIntField(term80691, term80691.getClass(), "totalAchievement", 19036895);
        setIntField(term80691, term80691.getClass(), "totalDeluxscore", 848352999);
        setIntField(term80691, term80691.getClass(), "playCount", 1414809033);
        setField(term80691, term80691.getClass(), "clearDate", "FgaHDSytdu");
        setField(term80691, term80691.getClass(), "lastPlayDate", "cmIDVqeLNI");
        setIntField(term80691, term80691.getClass(), "bestAchievement", 234055254);
        setField(term80691, term80691.getClass(), "bestAchievementDate", "XoYlWxsjIF");
        setIntField(term80691, term80691.getClass(), "bestDeluxscore", 977791910);
        setField(term80691, term80691.getClass(), "bestDeluxscoreDate", "xkIacuRHpE");
        term81102 = new Long(5760483545030857520L);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.maimai2.model.userdata.UserCourse");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = long.class;
        Object[] args = new Object[1];
        args[0] = term81102;
        callMethod(klass, "setId", argTypes, term80691, args);
    }

};


