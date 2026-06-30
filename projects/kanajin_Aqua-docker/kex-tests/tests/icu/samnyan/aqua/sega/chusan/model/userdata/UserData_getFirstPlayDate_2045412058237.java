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

public class UserData_getFirstPlayDate_2045412058237 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term279823;

    public UserData_getFirstPlayDate_2045412058237() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term279823 = newInstance(Class.forName("icu.samnyan.aqua.sega.chusan.model.userdata.UserData"));
        setLongField(term279823, term279823.getClass(), "id", 0L);
        setField(term279823, term279823.getClass(), "card", null);
        setField(term279823, term279823.getClass(), "userName", null);
        setIntField(term279823, term279823.getClass(), "level", 0);
        setIntField(term279823, term279823.getClass(), "reincarnationNum", 0);
        setField(term279823, term279823.getClass(), "exp", null);
        setLongField(term279823, term279823.getClass(), "point", 0L);
        setLongField(term279823, term279823.getClass(), "totalPoint", 0L);
        setIntField(term279823, term279823.getClass(), "playCount", 0);
        setIntField(term279823, term279823.getClass(), "multiPlayCount", 0);
        setIntField(term279823, term279823.getClass(), "playerRating", 0);
        setIntField(term279823, term279823.getClass(), "highestRating", 0);
        setIntField(term279823, term279823.getClass(), "nameplateId", 0);
        setIntField(term279823, term279823.getClass(), "frameId", 0);
        setIntField(term279823, term279823.getClass(), "characterId", 0);
        setIntField(term279823, term279823.getClass(), "trophyId", 0);
        setIntField(term279823, term279823.getClass(), "playedTutorialBit", 0);
        setIntField(term279823, term279823.getClass(), "firstTutorialCancelNum", 0);
        setIntField(term279823, term279823.getClass(), "masterTutorialCancelNum", 0);
        setIntField(term279823, term279823.getClass(), "totalMapNum", 0);
        setLongField(term279823, term279823.getClass(), "totalHiScore", 0L);
        setLongField(term279823, term279823.getClass(), "totalBasicHighScore", 0L);
        setLongField(term279823, term279823.getClass(), "totalAdvancedHighScore", 0L);
        setLongField(term279823, term279823.getClass(), "totalExpertHighScore", 0L);
        setLongField(term279823, term279823.getClass(), "totalMasterHighScore", 0L);
        setLongField(term279823, term279823.getClass(), "totalUltimaHighScore", 0L);
        setField(term279823, term279823.getClass(), "eventWatchedDate", null);
        setIntField(term279823, term279823.getClass(), "friendCount", 0);
        setField(term279823, term279823.getClass(), "firstGameId", null);
        setField(term279823, term279823.getClass(), "firstRomVersion", null);
        setField(term279823, term279823.getClass(), "firstDataVersion", null);
        setField(term279823, term279823.getClass(), "firstPlayDate", null);
        setField(term279823, term279823.getClass(), "lastGameId", null);
        setField(term279823, term279823.getClass(), "lastRomVersion", null);
        setField(term279823, term279823.getClass(), "lastDataVersion", null);
        setField(term279823, term279823.getClass(), "lastLoginDate", null);
        setField(term279823, term279823.getClass(), "lastPlayDate", null);
        setIntField(term279823, term279823.getClass(), "lastPlaceId", 0);
        setField(term279823, term279823.getClass(), "lastPlaceName", null);
        setField(term279823, term279823.getClass(), "lastRegionId", null);
        setField(term279823, term279823.getClass(), "lastRegionName", null);
        setField(term279823, term279823.getClass(), "lastAllNetId", null);
        setField(term279823, term279823.getClass(), "lastClientId", null);
        setField(term279823, term279823.getClass(), "lastCountryCode", null);
        setField(term279823, term279823.getClass(), "userNameEx", null);
        setField(term279823, term279823.getClass(), "compatibleCmVersion", null);
        setIntField(term279823, term279823.getClass(), "medal", 0);
        setIntField(term279823, term279823.getClass(), "mapIconId", 0);
        setIntField(term279823, term279823.getClass(), "voiceId", 0);
        setIntField(term279823, term279823.getClass(), "avatarWear", 0);
        setIntField(term279823, term279823.getClass(), "avatarHead", 0);
        setIntField(term279823, term279823.getClass(), "avatarFace", 0);
        setIntField(term279823, term279823.getClass(), "avatarSkin", 0);
        setIntField(term279823, term279823.getClass(), "avatarItem", 0);
        setIntField(term279823, term279823.getClass(), "avatarFront", 0);
        setIntField(term279823, term279823.getClass(), "avatarBack", 0);
        setIntField(term279823, term279823.getClass(), "classEmblemBase", 0);
        setIntField(term279823, term279823.getClass(), "classEmblemMedal", 0);
        setIntField(term279823, term279823.getClass(), "stockedGridCount", 0);
        setIntField(term279823, term279823.getClass(), "exMapLoopCount", 0);
        setIntField(term279823, term279823.getClass(), "netBattlePlayCount", 0);
        setIntField(term279823, term279823.getClass(), "netBattleWinCount", 0);
        setIntField(term279823, term279823.getClass(), "netBattleLoseCount", 0);
        setIntField(term279823, term279823.getClass(), "netBattleConsecutiveWinCount", 0);
        setIntField(term279823, term279823.getClass(), "charaIllustId", 0);
        setIntField(term279823, term279823.getClass(), "skillId", 0);
        setIntField(term279823, term279823.getClass(), "overPowerPoint", 0);
        setIntField(term279823, term279823.getClass(), "overPowerRate", 0);
        setIntField(term279823, term279823.getClass(), "overPowerLowerRank", 0);
        setIntField(term279823, term279823.getClass(), "avatarPoint", 0);
        setIntField(term279823, term279823.getClass(), "battleRankId", 0);
        setIntField(term279823, term279823.getClass(), "battleRankPoint", 0);
        setIntField(term279823, term279823.getClass(), "eliteRankPoint", 0);
        setIntField(term279823, term279823.getClass(), "netBattle1stCount", 0);
        setIntField(term279823, term279823.getClass(), "netBattle2ndCount", 0);
        setIntField(term279823, term279823.getClass(), "netBattle3rdCount", 0);
        setIntField(term279823, term279823.getClass(), "netBattle4thCount", 0);
        setIntField(term279823, term279823.getClass(), "netBattleCorrection", 0);
        setIntField(term279823, term279823.getClass(), "netBattleErrCnt", 0);
        setIntField(term279823, term279823.getClass(), "netBattleHostErrCnt", 0);
        setIntField(term279823, term279823.getClass(), "battleRewardStatus", 0);
        setIntField(term279823, term279823.getClass(), "battleRewardIndex", 0);
        setIntField(term279823, term279823.getClass(), "battleRewardCount", 0);
        setIntField(term279823, term279823.getClass(), "ext1", 0);
        setIntField(term279823, term279823.getClass(), "ext2", 0);
        setIntField(term279823, term279823.getClass(), "ext3", 0);
        setIntField(term279823, term279823.getClass(), "ext4", 0);
        setIntField(term279823, term279823.getClass(), "ext5", 0);
        setIntField(term279823, term279823.getClass(), "ext6", 0);
        setIntField(term279823, term279823.getClass(), "ext7", 0);
        setIntField(term279823, term279823.getClass(), "ext8", 0);
        setIntField(term279823, term279823.getClass(), "ext9", 0);
        setIntField(term279823, term279823.getClass(), "ext10", 0);
        setField(term279823, term279823.getClass(), "extStr1", null);
        setField(term279823, term279823.getClass(), "extStr2", null);
        setLongField(term279823, term279823.getClass(), "extLong1", 0L);
        setLongField(term279823, term279823.getClass(), "extLong2", 0L);
        setField(term279823, term279823.getClass(), "rankUpChallengeResults", null);
        setBooleanField(term279823, term279823.getClass(), "isNetBattleHost", false);
        setIntField(term279823, term279823.getClass(), "netBattleEndState", 0);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.chusan.model.userdata.UserData");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getFirstPlayDate", argTypes, term279823, args);
    }

};


