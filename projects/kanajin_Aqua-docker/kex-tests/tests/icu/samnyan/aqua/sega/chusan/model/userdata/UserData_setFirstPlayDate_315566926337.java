package icu.samnyan.aqua.sega.chusan.model.userdata;

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
import static icu.samnyan.aqua.sega.chusan.model.userdata.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;

public class UserData_setFirstPlayDate_315566926337 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term287571;

    public UserData_setFirstPlayDate_315566926337() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term287571 = newInstance(Class.forName("icu.samnyan.aqua.sega.chusan.model.userdata.UserData"));
        setLongField(term287571, term287571.getClass(), "id", 0L);
        setField(term287571, term287571.getClass(), "card", null);
        setField(term287571, term287571.getClass(), "userName", null);
        setIntField(term287571, term287571.getClass(), "level", 0);
        setIntField(term287571, term287571.getClass(), "reincarnationNum", 0);
        setField(term287571, term287571.getClass(), "exp", null);
        setLongField(term287571, term287571.getClass(), "point", 0L);
        setLongField(term287571, term287571.getClass(), "totalPoint", 0L);
        setIntField(term287571, term287571.getClass(), "playCount", 0);
        setIntField(term287571, term287571.getClass(), "multiPlayCount", 0);
        setIntField(term287571, term287571.getClass(), "playerRating", 0);
        setIntField(term287571, term287571.getClass(), "highestRating", 0);
        setIntField(term287571, term287571.getClass(), "nameplateId", 0);
        setIntField(term287571, term287571.getClass(), "frameId", 0);
        setIntField(term287571, term287571.getClass(), "characterId", 0);
        setIntField(term287571, term287571.getClass(), "trophyId", 0);
        setIntField(term287571, term287571.getClass(), "playedTutorialBit", 0);
        setIntField(term287571, term287571.getClass(), "firstTutorialCancelNum", 0);
        setIntField(term287571, term287571.getClass(), "masterTutorialCancelNum", 0);
        setIntField(term287571, term287571.getClass(), "totalMapNum", 0);
        setLongField(term287571, term287571.getClass(), "totalHiScore", 0L);
        setLongField(term287571, term287571.getClass(), "totalBasicHighScore", 0L);
        setLongField(term287571, term287571.getClass(), "totalAdvancedHighScore", 0L);
        setLongField(term287571, term287571.getClass(), "totalExpertHighScore", 0L);
        setLongField(term287571, term287571.getClass(), "totalMasterHighScore", 0L);
        setLongField(term287571, term287571.getClass(), "totalUltimaHighScore", 0L);
        setField(term287571, term287571.getClass(), "eventWatchedDate", null);
        setIntField(term287571, term287571.getClass(), "friendCount", 0);
        setField(term287571, term287571.getClass(), "firstGameId", null);
        setField(term287571, term287571.getClass(), "firstRomVersion", null);
        setField(term287571, term287571.getClass(), "firstDataVersion", null);
        setField(term287571, term287571.getClass(), "firstPlayDate", null);
        setField(term287571, term287571.getClass(), "lastGameId", null);
        setField(term287571, term287571.getClass(), "lastRomVersion", null);
        setField(term287571, term287571.getClass(), "lastDataVersion", null);
        setField(term287571, term287571.getClass(), "lastLoginDate", null);
        setField(term287571, term287571.getClass(), "lastPlayDate", null);
        setIntField(term287571, term287571.getClass(), "lastPlaceId", 0);
        setField(term287571, term287571.getClass(), "lastPlaceName", null);
        setField(term287571, term287571.getClass(), "lastRegionId", null);
        setField(term287571, term287571.getClass(), "lastRegionName", null);
        setField(term287571, term287571.getClass(), "lastAllNetId", null);
        setField(term287571, term287571.getClass(), "lastClientId", null);
        setField(term287571, term287571.getClass(), "lastCountryCode", null);
        setField(term287571, term287571.getClass(), "userNameEx", null);
        setField(term287571, term287571.getClass(), "compatibleCmVersion", null);
        setIntField(term287571, term287571.getClass(), "medal", 0);
        setIntField(term287571, term287571.getClass(), "mapIconId", 0);
        setIntField(term287571, term287571.getClass(), "voiceId", 0);
        setIntField(term287571, term287571.getClass(), "avatarWear", 0);
        setIntField(term287571, term287571.getClass(), "avatarHead", 0);
        setIntField(term287571, term287571.getClass(), "avatarFace", 0);
        setIntField(term287571, term287571.getClass(), "avatarSkin", 0);
        setIntField(term287571, term287571.getClass(), "avatarItem", 0);
        setIntField(term287571, term287571.getClass(), "avatarFront", 0);
        setIntField(term287571, term287571.getClass(), "avatarBack", 0);
        setIntField(term287571, term287571.getClass(), "classEmblemBase", 0);
        setIntField(term287571, term287571.getClass(), "classEmblemMedal", 0);
        setIntField(term287571, term287571.getClass(), "stockedGridCount", 0);
        setIntField(term287571, term287571.getClass(), "exMapLoopCount", 0);
        setIntField(term287571, term287571.getClass(), "netBattlePlayCount", 0);
        setIntField(term287571, term287571.getClass(), "netBattleWinCount", 0);
        setIntField(term287571, term287571.getClass(), "netBattleLoseCount", 0);
        setIntField(term287571, term287571.getClass(), "netBattleConsecutiveWinCount", 0);
        setIntField(term287571, term287571.getClass(), "charaIllustId", 0);
        setIntField(term287571, term287571.getClass(), "skillId", 0);
        setIntField(term287571, term287571.getClass(), "overPowerPoint", 0);
        setIntField(term287571, term287571.getClass(), "overPowerRate", 0);
        setIntField(term287571, term287571.getClass(), "overPowerLowerRank", 0);
        setIntField(term287571, term287571.getClass(), "avatarPoint", 0);
        setIntField(term287571, term287571.getClass(), "battleRankId", 0);
        setIntField(term287571, term287571.getClass(), "battleRankPoint", 0);
        setIntField(term287571, term287571.getClass(), "eliteRankPoint", 0);
        setIntField(term287571, term287571.getClass(), "netBattle1stCount", 0);
        setIntField(term287571, term287571.getClass(), "netBattle2ndCount", 0);
        setIntField(term287571, term287571.getClass(), "netBattle3rdCount", 0);
        setIntField(term287571, term287571.getClass(), "netBattle4thCount", 0);
        setIntField(term287571, term287571.getClass(), "netBattleCorrection", 0);
        setIntField(term287571, term287571.getClass(), "netBattleErrCnt", 0);
        setIntField(term287571, term287571.getClass(), "netBattleHostErrCnt", 0);
        setIntField(term287571, term287571.getClass(), "battleRewardStatus", 0);
        setIntField(term287571, term287571.getClass(), "battleRewardIndex", 0);
        setIntField(term287571, term287571.getClass(), "battleRewardCount", 0);
        setIntField(term287571, term287571.getClass(), "ext1", 0);
        setIntField(term287571, term287571.getClass(), "ext2", 0);
        setIntField(term287571, term287571.getClass(), "ext3", 0);
        setIntField(term287571, term287571.getClass(), "ext4", 0);
        setIntField(term287571, term287571.getClass(), "ext5", 0);
        setIntField(term287571, term287571.getClass(), "ext6", 0);
        setIntField(term287571, term287571.getClass(), "ext7", 0);
        setIntField(term287571, term287571.getClass(), "ext8", 0);
        setIntField(term287571, term287571.getClass(), "ext9", 0);
        setIntField(term287571, term287571.getClass(), "ext10", 0);
        setField(term287571, term287571.getClass(), "extStr1", null);
        setField(term287571, term287571.getClass(), "extStr2", null);
        setLongField(term287571, term287571.getClass(), "extLong1", 0L);
        setLongField(term287571, term287571.getClass(), "extLong2", 0L);
        setField(term287571, term287571.getClass(), "rankUpChallengeResults", null);
        setBooleanField(term287571, term287571.getClass(), "isNetBattleHost", false);
        setIntField(term287571, term287571.getClass(), "netBattleEndState", 0);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.chusan.model.userdata.UserData");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.time.LocalDateTime");
        Object[] args = new Object[1];
        args[0] = null;
        callMethod(klass, "setFirstPlayDate", argTypes, term287571, args);
    }

};


