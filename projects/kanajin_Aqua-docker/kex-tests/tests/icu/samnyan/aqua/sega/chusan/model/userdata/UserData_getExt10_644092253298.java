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

public class UserData_getExt10_644092253298 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term284520;

    public UserData_getExt10_644092253298() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term284520 = newInstance(Class.forName("icu.samnyan.aqua.sega.chusan.model.userdata.UserData"));
        setLongField(term284520, term284520.getClass(), "id", 0L);
        setField(term284520, term284520.getClass(), "card", null);
        setField(term284520, term284520.getClass(), "userName", null);
        setIntField(term284520, term284520.getClass(), "level", 0);
        setIntField(term284520, term284520.getClass(), "reincarnationNum", 0);
        setField(term284520, term284520.getClass(), "exp", null);
        setLongField(term284520, term284520.getClass(), "point", 0L);
        setLongField(term284520, term284520.getClass(), "totalPoint", 0L);
        setIntField(term284520, term284520.getClass(), "playCount", 0);
        setIntField(term284520, term284520.getClass(), "multiPlayCount", 0);
        setIntField(term284520, term284520.getClass(), "playerRating", 0);
        setIntField(term284520, term284520.getClass(), "highestRating", 0);
        setIntField(term284520, term284520.getClass(), "nameplateId", 0);
        setIntField(term284520, term284520.getClass(), "frameId", 0);
        setIntField(term284520, term284520.getClass(), "characterId", 0);
        setIntField(term284520, term284520.getClass(), "trophyId", 0);
        setIntField(term284520, term284520.getClass(), "playedTutorialBit", 0);
        setIntField(term284520, term284520.getClass(), "firstTutorialCancelNum", 0);
        setIntField(term284520, term284520.getClass(), "masterTutorialCancelNum", 0);
        setIntField(term284520, term284520.getClass(), "totalMapNum", 0);
        setLongField(term284520, term284520.getClass(), "totalHiScore", 0L);
        setLongField(term284520, term284520.getClass(), "totalBasicHighScore", 0L);
        setLongField(term284520, term284520.getClass(), "totalAdvancedHighScore", 0L);
        setLongField(term284520, term284520.getClass(), "totalExpertHighScore", 0L);
        setLongField(term284520, term284520.getClass(), "totalMasterHighScore", 0L);
        setLongField(term284520, term284520.getClass(), "totalUltimaHighScore", 0L);
        setField(term284520, term284520.getClass(), "eventWatchedDate", null);
        setIntField(term284520, term284520.getClass(), "friendCount", 0);
        setField(term284520, term284520.getClass(), "firstGameId", null);
        setField(term284520, term284520.getClass(), "firstRomVersion", null);
        setField(term284520, term284520.getClass(), "firstDataVersion", null);
        setField(term284520, term284520.getClass(), "firstPlayDate", null);
        setField(term284520, term284520.getClass(), "lastGameId", null);
        setField(term284520, term284520.getClass(), "lastRomVersion", null);
        setField(term284520, term284520.getClass(), "lastDataVersion", null);
        setField(term284520, term284520.getClass(), "lastLoginDate", null);
        setField(term284520, term284520.getClass(), "lastPlayDate", null);
        setIntField(term284520, term284520.getClass(), "lastPlaceId", 0);
        setField(term284520, term284520.getClass(), "lastPlaceName", null);
        setField(term284520, term284520.getClass(), "lastRegionId", null);
        setField(term284520, term284520.getClass(), "lastRegionName", null);
        setField(term284520, term284520.getClass(), "lastAllNetId", null);
        setField(term284520, term284520.getClass(), "lastClientId", null);
        setField(term284520, term284520.getClass(), "lastCountryCode", null);
        setField(term284520, term284520.getClass(), "userNameEx", null);
        setField(term284520, term284520.getClass(), "compatibleCmVersion", null);
        setIntField(term284520, term284520.getClass(), "medal", 0);
        setIntField(term284520, term284520.getClass(), "mapIconId", 0);
        setIntField(term284520, term284520.getClass(), "voiceId", 0);
        setIntField(term284520, term284520.getClass(), "avatarWear", 0);
        setIntField(term284520, term284520.getClass(), "avatarHead", 0);
        setIntField(term284520, term284520.getClass(), "avatarFace", 0);
        setIntField(term284520, term284520.getClass(), "avatarSkin", 0);
        setIntField(term284520, term284520.getClass(), "avatarItem", 0);
        setIntField(term284520, term284520.getClass(), "avatarFront", 0);
        setIntField(term284520, term284520.getClass(), "avatarBack", 0);
        setIntField(term284520, term284520.getClass(), "classEmblemBase", 0);
        setIntField(term284520, term284520.getClass(), "classEmblemMedal", 0);
        setIntField(term284520, term284520.getClass(), "stockedGridCount", 0);
        setIntField(term284520, term284520.getClass(), "exMapLoopCount", 0);
        setIntField(term284520, term284520.getClass(), "netBattlePlayCount", 0);
        setIntField(term284520, term284520.getClass(), "netBattleWinCount", 0);
        setIntField(term284520, term284520.getClass(), "netBattleLoseCount", 0);
        setIntField(term284520, term284520.getClass(), "netBattleConsecutiveWinCount", 0);
        setIntField(term284520, term284520.getClass(), "charaIllustId", 0);
        setIntField(term284520, term284520.getClass(), "skillId", 0);
        setIntField(term284520, term284520.getClass(), "overPowerPoint", 0);
        setIntField(term284520, term284520.getClass(), "overPowerRate", 0);
        setIntField(term284520, term284520.getClass(), "overPowerLowerRank", 0);
        setIntField(term284520, term284520.getClass(), "avatarPoint", 0);
        setIntField(term284520, term284520.getClass(), "battleRankId", 0);
        setIntField(term284520, term284520.getClass(), "battleRankPoint", 0);
        setIntField(term284520, term284520.getClass(), "eliteRankPoint", 0);
        setIntField(term284520, term284520.getClass(), "netBattle1stCount", 0);
        setIntField(term284520, term284520.getClass(), "netBattle2ndCount", 0);
        setIntField(term284520, term284520.getClass(), "netBattle3rdCount", 0);
        setIntField(term284520, term284520.getClass(), "netBattle4thCount", 0);
        setIntField(term284520, term284520.getClass(), "netBattleCorrection", 0);
        setIntField(term284520, term284520.getClass(), "netBattleErrCnt", 0);
        setIntField(term284520, term284520.getClass(), "netBattleHostErrCnt", 0);
        setIntField(term284520, term284520.getClass(), "battleRewardStatus", 0);
        setIntField(term284520, term284520.getClass(), "battleRewardIndex", 0);
        setIntField(term284520, term284520.getClass(), "battleRewardCount", 0);
        setIntField(term284520, term284520.getClass(), "ext1", 0);
        setIntField(term284520, term284520.getClass(), "ext2", 0);
        setIntField(term284520, term284520.getClass(), "ext3", 0);
        setIntField(term284520, term284520.getClass(), "ext4", 0);
        setIntField(term284520, term284520.getClass(), "ext5", 0);
        setIntField(term284520, term284520.getClass(), "ext6", 0);
        setIntField(term284520, term284520.getClass(), "ext7", 0);
        setIntField(term284520, term284520.getClass(), "ext8", 0);
        setIntField(term284520, term284520.getClass(), "ext9", 0);
        setIntField(term284520, term284520.getClass(), "ext10", 0);
        setField(term284520, term284520.getClass(), "extStr1", null);
        setField(term284520, term284520.getClass(), "extStr2", null);
        setLongField(term284520, term284520.getClass(), "extLong1", 0L);
        setLongField(term284520, term284520.getClass(), "extLong2", 0L);
        setField(term284520, term284520.getClass(), "rankUpChallengeResults", null);
        setBooleanField(term284520, term284520.getClass(), "isNetBattleHost", false);
        setIntField(term284520, term284520.getClass(), "netBattleEndState", 0);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.chusan.model.userdata.UserData");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getExt10", argTypes, term284520, args);
    }

};


