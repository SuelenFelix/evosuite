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

public class UserDetail_getDateTime_102144072976 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term4272596;

    public UserDetail_getDateTime_102144072976() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Long term4272600 = new Long(115184320156573542L);
        Integer term4272663 = new Integer(907419926);
        Integer term4272665 = new Integer(1410218337);
        Integer term4272667 = new Integer(-1548487396);
        Integer term4272669 = new Integer(-1092864344);
        Integer term4272671 = new Integer(909432589);
        ArrayList term4272661 = new ArrayList();
        ((ArrayList) term4272661).add(term4272663);
        ((ArrayList) term4272661).add(term4272665);
        ((ArrayList) term4272661).add(term4272667);
        ((ArrayList) term4272661).add(term4272669);
        ((ArrayList) term4272661).add(term4272671);
        Integer term4272677 = new Integer(-803102599);
        Integer term4272679 = new Integer(1911613745);
        Integer term4272681 = new Integer(-1397218525);
        Integer term4272683 = new Integer(-878133799);
        Integer term4272685 = new Integer(-1097564879);
        Integer term4272687 = new Integer(531804989);
        ArrayList term4272675 = new ArrayList();
        ((ArrayList) term4272675).add(term4272677);
        ((ArrayList) term4272675).add(term4272679);
        ((ArrayList) term4272675).add(term4272681);
        ((ArrayList) term4272675).add(term4272683);
        ((ArrayList) term4272675).add(term4272685);
        ((ArrayList) term4272675).add(term4272687);
        term4272596 = newInstance(Class.forName("icu.samnyan.aqua.sega.maimai2.model.userdata.UserDetail"));
        Object term4272598 = newInstance(Class.forName("icu.samnyan.aqua.sega.general.model.Card"));
        Object term4272614 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term4272615 = newInstance(Class.forName("java.time.LocalDate"));
        Object term4272619 = newInstance(Class.forName("java.time.LocalTime"));
        Object term4272624 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term4272625 = newInstance(Class.forName("java.time.LocalDate"));
        Object term4272629 = newInstance(Class.forName("java.time.LocalTime"));
        setLongField(term4272596, term4272596.getClass(), "id", 4676049117957267470L);
        setLongField(term4272598, term4272598.getClass(), "id", 2684981881141893077L);
        setField(term4272598, term4272598.getClass(), "extId", term4272600);
        setField(term4272598, term4272598.getClass(), "luid", "PeWdgFgyGz");
        setIntField(term4272615, term4272615.getClass(), "year", 2012);
        setShortField(term4272615, term4272615.getClass(), "month", (short) 9);
        setShortField(term4272615, term4272615.getClass(), "day", (short) 4);
        setField(term4272614, term4272614.getClass(), "date", term4272615);
        setByteField(term4272619, term4272619.getClass(), "hour", (byte) 3);
        setByteField(term4272619, term4272619.getClass(), "minute", (byte) 14);
        setByteField(term4272619, term4272619.getClass(), "second", (byte) 24);
        setIntField(term4272619, term4272619.getClass(), "nano", 635869976);
        setField(term4272614, term4272614.getClass(), "time", term4272619);
        setField(term4272598, term4272598.getClass(), "registerTime", term4272614);
        setIntField(term4272625, term4272625.getClass(), "year", 2015);
        setShortField(term4272625, term4272625.getClass(), "month", (short) 9);
        setShortField(term4272625, term4272625.getClass(), "day", (short) 1);
        setField(term4272624, term4272624.getClass(), "date", term4272625);
        setByteField(term4272629, term4272629.getClass(), "hour", (byte) 9);
        setByteField(term4272629, term4272629.getClass(), "minute", (byte) 48);
        setByteField(term4272629, term4272629.getClass(), "second", (byte) 23);
        setIntField(term4272629, term4272629.getClass(), "nano", 708224664);
        setField(term4272624, term4272624.getClass(), "time", term4272629);
        setField(term4272598, term4272598.getClass(), "accessTime", term4272624);
        setField(term4272596, term4272596.getClass(), "card", term4272598);
        setField(term4272596, term4272596.getClass(), "userName", "qpESCVDYtM");
        setIntField(term4272596, term4272596.getClass(), "isNetMember", -1472083342);
        setIntField(term4272596, term4272596.getClass(), "iconId", 1794999150);
        setIntField(term4272596, term4272596.getClass(), "plateId", 646961433);
        setIntField(term4272596, term4272596.getClass(), "titleId", -664394873);
        setIntField(term4272596, term4272596.getClass(), "partnerId", 347961437);
        setIntField(term4272596, term4272596.getClass(), "frameId", -36301083);
        setIntField(term4272596, term4272596.getClass(), "selectMapId", -440641870);
        setIntField(term4272596, term4272596.getClass(), "totalAwake", 416822261);
        setIntField(term4272596, term4272596.getClass(), "gradeRating", -129371615);
        setIntField(term4272596, term4272596.getClass(), "musicRating", 1063933232);
        setIntField(term4272596, term4272596.getClass(), "playerRating", -414890629);
        setIntField(term4272596, term4272596.getClass(), "highestRating", 1065292655);
        setIntField(term4272596, term4272596.getClass(), "gradeRank", 1628621917);
        setIntField(term4272596, term4272596.getClass(), "classRank", 675691826);
        setIntField(term4272596, term4272596.getClass(), "courseRank", 1973832941);
        setField(term4272596, term4272596.getClass(), "charaSlot", term4272661);
        setField(term4272596, term4272596.getClass(), "charaLockSlot", term4272675);
        setLongField(term4272596, term4272596.getClass(), "contentBit", -5372731606545917142L);
        setIntField(term4272596, term4272596.getClass(), "playCount", -63261775);
        setField(term4272596, term4272596.getClass(), "eventWatchedDate", "JXAyvfdZst");
        setField(term4272596, term4272596.getClass(), "lastGameId", "rGKoVMyoSh");
        setField(term4272596, term4272596.getClass(), "lastRomVersion", "ESrbdzWOaK");
        setField(term4272596, term4272596.getClass(), "lastDataVersion", "AVCNpXLsbo");
        setField(term4272596, term4272596.getClass(), "lastLoginDate", "mwxxVrjTnl");
        setField(term4272596, term4272596.getClass(), "lastPlayDate", "oJnRwoFOcI");
        setIntField(term4272596, term4272596.getClass(), "lastPlayCredit", 1101263990);
        setIntField(term4272596, term4272596.getClass(), "lastPlayMode", -2147436614);
        setIntField(term4272596, term4272596.getClass(), "lastPlaceId", -105956271);
        setField(term4272596, term4272596.getClass(), "lastPlaceName", "vIWjfbCijh");
        setIntField(term4272596, term4272596.getClass(), "lastAllNetId", 268440480);
        setIntField(term4272596, term4272596.getClass(), "lastRegionId", -1582051654);
        setField(term4272596, term4272596.getClass(), "lastRegionName", "DwpBbuVAnB");
        setField(term4272596, term4272596.getClass(), "lastClientId", "OJrTEmLhBB");
        setField(term4272596, term4272596.getClass(), "lastCountryCode", "vLNlFSVdsa");
        setIntField(term4272596, term4272596.getClass(), "lastSelectEMoney", 999212240);
        setIntField(term4272596, term4272596.getClass(), "lastSelectTicket", -2145923195);
        setIntField(term4272596, term4272596.getClass(), "lastSelectCourse", 1279008447);
        setIntField(term4272596, term4272596.getClass(), "lastCountCourse", -957443384);
        setField(term4272596, term4272596.getClass(), "firstGameId", "NvkrGHRSgP");
        setField(term4272596, term4272596.getClass(), "firstRomVersion", "JmHfjKhqev");
        setField(term4272596, term4272596.getClass(), "firstDataVersion", "QLENqmEWPT");
        setField(term4272596, term4272596.getClass(), "firstPlayDate", "qESWGEQCqV");
        setField(term4272596, term4272596.getClass(), "compatibleCmVersion", "KMmODfjoHJ");
        setField(term4272596, term4272596.getClass(), "dailyBonusDate", "MAOgmNUMaT");
        setField(term4272596, term4272596.getClass(), "dailyCourseBonusDate", "xCKHWOZTIr");
        setField(term4272596, term4272596.getClass(), "lastPairLoginDate", "fGlyQhhVYx");
        setField(term4272596, term4272596.getClass(), "lastTrialPlayDate", "ymFNsNrZMA");
        setIntField(term4272596, term4272596.getClass(), "playVsCount", 1963698768);
        setIntField(term4272596, term4272596.getClass(), "playSyncCount", 1543797759);
        setIntField(term4272596, term4272596.getClass(), "winCount", -1925148697);
        setIntField(term4272596, term4272596.getClass(), "helpCount", -1091532240);
        setIntField(term4272596, term4272596.getClass(), "comboCount", -155387971);
        setLongField(term4272596, term4272596.getClass(), "totalDeluxscore", 6416018976289775335L);
        setLongField(term4272596, term4272596.getClass(), "totalBasicDeluxscore", -6687919746254504851L);
        setLongField(term4272596, term4272596.getClass(), "totalAdvancedDeluxscore", 2718221375089287391L);
        setLongField(term4272596, term4272596.getClass(), "totalExpertDeluxscore", -4880305581353101520L);
        setLongField(term4272596, term4272596.getClass(), "totalMasterDeluxscore", -6660359710771572938L);
        setLongField(term4272596, term4272596.getClass(), "totalReMasterDeluxscore", -2674337610485926875L);
        setIntField(term4272596, term4272596.getClass(), "totalSync", 1385990674);
        setIntField(term4272596, term4272596.getClass(), "totalBasicSync", 1720699703);
        setIntField(term4272596, term4272596.getClass(), "totalAdvancedSync", 1716720982);
        setIntField(term4272596, term4272596.getClass(), "totalExpertSync", 674394958);
        setIntField(term4272596, term4272596.getClass(), "totalMasterSync", 655490672);
        setIntField(term4272596, term4272596.getClass(), "totalReMasterSync", -1682447544);
        setLongField(term4272596, term4272596.getClass(), "totalAchievement", 4586455792933711640L);
        setLongField(term4272596, term4272596.getClass(), "totalBasicAchievement", 5963005489679459993L);
        setLongField(term4272596, term4272596.getClass(), "totalAdvancedAchievement", -1229572112205366714L);
        setLongField(term4272596, term4272596.getClass(), "totalExpertAchievement", -8200162467190197763L);
        setLongField(term4272596, term4272596.getClass(), "totalMasterAchievement", -4842975884142532035L);
        setLongField(term4272596, term4272596.getClass(), "totalReMasterAchievement", 8072772333820150690L);
        setLongField(term4272596, term4272596.getClass(), "playerOldRating", 3073859384542417304L);
        setLongField(term4272596, term4272596.getClass(), "playerNewRating", 4410474773469054147L);
        setIntField(term4272596, term4272596.getClass(), "banState", -2004182373);
        setLongField(term4272596, term4272596.getClass(), "dateTime", -6663654445939480654L);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.maimai2.model.userdata.UserDetail");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getDateTime", argTypes, term4272596, args);
    }

};


