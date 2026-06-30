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

public class UserCharge_setStock_104275652710 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term127067;
     Object term127456;

    public UserCharge_setStock_104275652710() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Long term127073 = new Long(5731563613239387113L);
        Integer term127136 = new Integer(-1189468129);
        Integer term127138 = new Integer(-1099664830);
        Integer term127140 = new Integer(873502011);
        ArrayList term127134 = new ArrayList();
        ((ArrayList) term127134).add(term127136);
        ((ArrayList) term127134).add(term127138);
        ((ArrayList) term127134).add(term127140);
        Integer term127146 = new Integer(-2004575734);
        Integer term127148 = new Integer(1491468856);
        Integer term127150 = new Integer(962385185);
        Integer term127152 = new Integer(2146718886);
        Integer term127154 = new Integer(-985577036);
        Integer term127156 = new Integer(802539130);
        Integer term127158 = new Integer(2105146188);
        Integer term127160 = new Integer(-862415480);
        ArrayList term127144 = new ArrayList();
        ((ArrayList) term127144).add(term127146);
        ((ArrayList) term127144).add(term127148);
        ((ArrayList) term127144).add(term127150);
        ((ArrayList) term127144).add(term127152);
        ((ArrayList) term127144).add(term127154);
        ((ArrayList) term127144).add(term127156);
        ((ArrayList) term127144).add(term127158);
        ((ArrayList) term127144).add(term127160);
        term127067 = newInstance(Class.forName("icu.samnyan.aqua.sega.maimai2.model.userdata.UserCharge"));
        Object term127069 = newInstance(Class.forName("icu.samnyan.aqua.sega.maimai2.model.userdata.UserDetail"));
        Object term127071 = newInstance(Class.forName("icu.samnyan.aqua.sega.general.model.Card"));
        Object term127087 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term127088 = newInstance(Class.forName("java.time.LocalDate"));
        Object term127092 = newInstance(Class.forName("java.time.LocalTime"));
        Object term127097 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term127098 = newInstance(Class.forName("java.time.LocalDate"));
        Object term127102 = newInstance(Class.forName("java.time.LocalTime"));
        setLongField(term127067, term127067.getClass(), "id", 4119682614384825784L);
        setLongField(term127069, term127069.getClass(), "id", -7810027323437632531L);
        setLongField(term127071, term127071.getClass(), "id", 6282706686257533309L);
        setField(term127071, term127071.getClass(), "extId", term127073);
        setField(term127071, term127071.getClass(), "luid", "AKbzAaAcmX");
        setIntField(term127088, term127088.getClass(), "year", 2026);
        setShortField(term127088, term127088.getClass(), "month", (short) 12);
        setShortField(term127088, term127088.getClass(), "day", (short) 22);
        setField(term127087, term127087.getClass(), "date", term127088);
        setByteField(term127092, term127092.getClass(), "hour", (byte) 19);
        setByteField(term127092, term127092.getClass(), "minute", (byte) 39);
        setByteField(term127092, term127092.getClass(), "second", (byte) 23);
        setIntField(term127092, term127092.getClass(), "nano", 342247024);
        setField(term127087, term127087.getClass(), "time", term127092);
        setField(term127071, term127071.getClass(), "registerTime", term127087);
        setIntField(term127098, term127098.getClass(), "year", 2020);
        setShortField(term127098, term127098.getClass(), "month", (short) 5);
        setShortField(term127098, term127098.getClass(), "day", (short) 8);
        setField(term127097, term127097.getClass(), "date", term127098);
        setByteField(term127102, term127102.getClass(), "hour", (byte) 8);
        setByteField(term127102, term127102.getClass(), "minute", (byte) 25);
        setByteField(term127102, term127102.getClass(), "second", (byte) 28);
        setIntField(term127102, term127102.getClass(), "nano", 159788425);
        setField(term127097, term127097.getClass(), "time", term127102);
        setField(term127071, term127071.getClass(), "accessTime", term127097);
        setField(term127069, term127069.getClass(), "card", term127071);
        setField(term127069, term127069.getClass(), "userName", "xiloHjgKux");
        setIntField(term127069, term127069.getClass(), "isNetMember", 798975305);
        setIntField(term127069, term127069.getClass(), "iconId", -290202123);
        setIntField(term127069, term127069.getClass(), "plateId", -858738604);
        setIntField(term127069, term127069.getClass(), "titleId", -1508450432);
        setIntField(term127069, term127069.getClass(), "partnerId", -1168985350);
        setIntField(term127069, term127069.getClass(), "frameId", 736504530);
        setIntField(term127069, term127069.getClass(), "selectMapId", -1151578095);
        setIntField(term127069, term127069.getClass(), "totalAwake", -666674757);
        setIntField(term127069, term127069.getClass(), "gradeRating", -618304525);
        setIntField(term127069, term127069.getClass(), "musicRating", 1975532031);
        setIntField(term127069, term127069.getClass(), "playerRating", -1548999687);
        setIntField(term127069, term127069.getClass(), "highestRating", 1593514066);
        setIntField(term127069, term127069.getClass(), "gradeRank", 1329551874);
        setIntField(term127069, term127069.getClass(), "classRank", -378332024);
        setIntField(term127069, term127069.getClass(), "courseRank", 77686011);
        setField(term127069, term127069.getClass(), "charaSlot", term127134);
        setField(term127069, term127069.getClass(), "charaLockSlot", term127144);
        setLongField(term127069, term127069.getClass(), "contentBit", 3618166054030395880L);
        setIntField(term127069, term127069.getClass(), "playCount", 132651471);
        setField(term127069, term127069.getClass(), "eventWatchedDate", "Pmajvqueiq");
        setField(term127069, term127069.getClass(), "lastGameId", "VjCLvZgmuN");
        setField(term127069, term127069.getClass(), "lastRomVersion", "tQCalivCMp");
        setField(term127069, term127069.getClass(), "lastDataVersion", "fEiosUzVPM");
        setField(term127069, term127069.getClass(), "lastLoginDate", "USPyxkJGgn");
        setField(term127069, term127069.getClass(), "lastPlayDate", "VniuLGKjLe");
        setIntField(term127069, term127069.getClass(), "lastPlayCredit", 1315153287);
        setIntField(term127069, term127069.getClass(), "lastPlayMode", 760555251);
        setIntField(term127069, term127069.getClass(), "lastPlaceId", -706677210);
        setField(term127069, term127069.getClass(), "lastPlaceName", "nuzwgdczLX");
        setIntField(term127069, term127069.getClass(), "lastAllNetId", -468204040);
        setIntField(term127069, term127069.getClass(), "lastRegionId", -1236041569);
        setField(term127069, term127069.getClass(), "lastRegionName", "FdFPAsGWZj");
        setField(term127069, term127069.getClass(), "lastClientId", "sqctDxfcQV");
        setField(term127069, term127069.getClass(), "lastCountryCode", "KHXlwfHOLE");
        setIntField(term127069, term127069.getClass(), "lastSelectEMoney", -1932056684);
        setIntField(term127069, term127069.getClass(), "lastSelectTicket", -1418002835);
        setIntField(term127069, term127069.getClass(), "lastSelectCourse", -1020428732);
        setIntField(term127069, term127069.getClass(), "lastCountCourse", -1341267836);
        setField(term127069, term127069.getClass(), "firstGameId", "oxoYdAYVkI");
        setField(term127069, term127069.getClass(), "firstRomVersion", "jUYVgbuaNi");
        setField(term127069, term127069.getClass(), "firstDataVersion", "IVqaVowLVl");
        setField(term127069, term127069.getClass(), "firstPlayDate", "wsWWrTxdcC");
        setField(term127069, term127069.getClass(), "compatibleCmVersion", "UPDwVukZbZ");
        setField(term127069, term127069.getClass(), "dailyBonusDate", "nFQQbKAYNp");
        setField(term127069, term127069.getClass(), "dailyCourseBonusDate", "VQkWATPAEW");
        setField(term127069, term127069.getClass(), "lastPairLoginDate", "giGfkdhPAE");
        setField(term127069, term127069.getClass(), "lastTrialPlayDate", "wNfBmUuDuP");
        setIntField(term127069, term127069.getClass(), "playVsCount", 895888926);
        setIntField(term127069, term127069.getClass(), "playSyncCount", -808723798);
        setIntField(term127069, term127069.getClass(), "winCount", -448183926);
        setIntField(term127069, term127069.getClass(), "helpCount", -1475942094);
        setIntField(term127069, term127069.getClass(), "comboCount", 602519677);
        setLongField(term127069, term127069.getClass(), "totalDeluxscore", 2748063209175916338L);
        setLongField(term127069, term127069.getClass(), "totalBasicDeluxscore", 3289259176692658905L);
        setLongField(term127069, term127069.getClass(), "totalAdvancedDeluxscore", 8435578074607494266L);
        setLongField(term127069, term127069.getClass(), "totalExpertDeluxscore", 1158999985649712324L);
        setLongField(term127069, term127069.getClass(), "totalMasterDeluxscore", 1240831512723722148L);
        setLongField(term127069, term127069.getClass(), "totalReMasterDeluxscore", -5427519956812562732L);
        setIntField(term127069, term127069.getClass(), "totalSync", -370431003);
        setIntField(term127069, term127069.getClass(), "totalBasicSync", 822630139);
        setIntField(term127069, term127069.getClass(), "totalAdvancedSync", 385347406);
        setIntField(term127069, term127069.getClass(), "totalExpertSync", -46704413);
        setIntField(term127069, term127069.getClass(), "totalMasterSync", -2137913899);
        setIntField(term127069, term127069.getClass(), "totalReMasterSync", -688835502);
        setLongField(term127069, term127069.getClass(), "totalAchievement", 6139192874538815024L);
        setLongField(term127069, term127069.getClass(), "totalBasicAchievement", 2328251836921519486L);
        setLongField(term127069, term127069.getClass(), "totalAdvancedAchievement", 5343471362225022865L);
        setLongField(term127069, term127069.getClass(), "totalExpertAchievement", 5497156593559186662L);
        setLongField(term127069, term127069.getClass(), "totalMasterAchievement", 6687061627800420404L);
        setLongField(term127069, term127069.getClass(), "totalReMasterAchievement", 4389517814029817218L);
        setLongField(term127069, term127069.getClass(), "playerOldRating", 4390960699657111744L);
        setLongField(term127069, term127069.getClass(), "playerNewRating", -4293598789426929923L);
        setIntField(term127069, term127069.getClass(), "banState", 1469264963);
        setLongField(term127069, term127069.getClass(), "dateTime", 8372414958364597663L);
        setField(term127067, term127067.getClass(), "user", term127069);
        setIntField(term127067, term127067.getClass(), "chargeId", 802302241);
        setIntField(term127067, term127067.getClass(), "stock", -2086174298);
        setField(term127067, term127067.getClass(), "purchaseDate", "lNTNKavUNL");
        setField(term127067, term127067.getClass(), "validDate", "BXfmFjgpOy");
        term127456 = new Integer(-218426551);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.maimai2.model.userdata.UserCharge");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = int.class;
        Object[] args = new Object[1];
        args[0] = term127456;
        callMethod(klass, "setStock", argTypes, term127067, args);
    }

};


