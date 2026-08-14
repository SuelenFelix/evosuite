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

public class UserData_getId_449134134207 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term4212037;

    public UserData_getId_449134134207() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term4212037 = newInstance(Class.forName("icu.samnyan.aqua.sega.chusan.model.userdata.UserData"));
        setLongField(term4212037, term4212037.getClass(), "id", 0L);
        setField(term4212037, term4212037.getClass(), "card", null);
        setField(term4212037, term4212037.getClass(), "userName", null);
        setIntField(term4212037, term4212037.getClass(), "level", 0);
        setIntField(term4212037, term4212037.getClass(), "reincarnationNum", 0);
        setField(term4212037, term4212037.getClass(), "exp", null);
        setLongField(term4212037, term4212037.getClass(), "point", 0L);
        setLongField(term4212037, term4212037.getClass(), "totalPoint", 0L);
        setIntField(term4212037, term4212037.getClass(), "playCount", 0);
        setIntField(term4212037, term4212037.getClass(), "multiPlayCount", 0);
        setIntField(term4212037, term4212037.getClass(), "playerRating", 0);
        setIntField(term4212037, term4212037.getClass(), "highestRating", 0);
        setIntField(term4212037, term4212037.getClass(), "nameplateId", 0);
        setIntField(term4212037, term4212037.getClass(), "frameId", 0);
        setIntField(term4212037, term4212037.getClass(), "characterId", 0);
        setIntField(term4212037, term4212037.getClass(), "trophyId", 0);
        setIntField(term4212037, term4212037.getClass(), "playedTutorialBit", 0);
        setIntField(term4212037, term4212037.getClass(), "firstTutorialCancelNum", 0);
        setIntField(term4212037, term4212037.getClass(), "masterTutorialCancelNum", 0);
        setIntField(term4212037, term4212037.getClass(), "totalMapNum", 0);
        setLongField(term4212037, term4212037.getClass(), "totalHiScore", 0L);
        setLongField(term4212037, term4212037.getClass(), "totalBasicHighScore", 0L);
        setLongField(term4212037, term4212037.getClass(), "totalAdvancedHighScore", 0L);
        setLongField(term4212037, term4212037.getClass(), "totalExpertHighScore", 0L);
        setLongField(term4212037, term4212037.getClass(), "totalMasterHighScore", 0L);
        setLongField(term4212037, term4212037.getClass(), "totalUltimaHighScore", 0L);
        setField(term4212037, term4212037.getClass(), "eventWatchedDate", null);
        setIntField(term4212037, term4212037.getClass(), "friendCount", 0);
        setField(term4212037, term4212037.getClass(), "firstGameId", null);
        setField(term4212037, term4212037.getClass(), "firstRomVersion", null);
        setField(term4212037, term4212037.getClass(), "firstDataVersion", null);
        setField(term4212037, term4212037.getClass(), "firstPlayDate", null);
        setField(term4212037, term4212037.getClass(), "lastGameId", null);
        setField(term4212037, term4212037.getClass(), "lastRomVersion", null);
        setField(term4212037, term4212037.getClass(), "lastDataVersion", null);
        setField(term4212037, term4212037.getClass(), "lastLoginDate", null);
        setField(term4212037, term4212037.getClass(), "lastPlayDate", null);
        setIntField(term4212037, term4212037.getClass(), "lastPlaceId", 0);
        setField(term4212037, term4212037.getClass(), "lastPlaceName", null);
        setField(term4212037, term4212037.getClass(), "lastRegionId", null);
        setField(term4212037, term4212037.getClass(), "lastRegionName", null);
        setField(term4212037, term4212037.getClass(), "lastAllNetId", null);
        setField(term4212037, term4212037.getClass(), "lastClientId", null);
        setField(term4212037, term4212037.getClass(), "lastCountryCode", null);
        setField(term4212037, term4212037.getClass(), "userNameEx", null);
        setField(term4212037, term4212037.getClass(), "compatibleCmVersion", null);
        setIntField(term4212037, term4212037.getClass(), "medal", 0);
        setIntField(term4212037, term4212037.getClass(), "mapIconId", 0);
        setIntField(term4212037, term4212037.getClass(), "voiceId", 0);
        setIntField(term4212037, term4212037.getClass(), "avatarWear", 0);
        setIntField(term4212037, term4212037.getClass(), "avatarHead", 0);
        setIntField(term4212037, term4212037.getClass(), "avatarFace", 0);
        setIntField(term4212037, term4212037.getClass(), "avatarSkin", 0);
        setIntField(term4212037, term4212037.getClass(), "avatarItem", 0);
        setIntField(term4212037, term4212037.getClass(), "avatarFront", 0);
        setIntField(term4212037, term4212037.getClass(), "avatarBack", 0);
        setIntField(term4212037, term4212037.getClass(), "classEmblemBase", 0);
        setIntField(term4212037, term4212037.getClass(), "classEmblemMedal", 0);
        setIntField(term4212037, term4212037.getClass(), "stockedGridCount", 0);
        setIntField(term4212037, term4212037.getClass(), "exMapLoopCount", 0);
        setIntField(term4212037, term4212037.getClass(), "netBattlePlayCount", 0);
        setIntField(term4212037, term4212037.getClass(), "netBattleWinCount", 0);
        setIntField(term4212037, term4212037.getClass(), "netBattleLoseCount", 0);
        setIntField(term4212037, term4212037.getClass(), "netBattleConsecutiveWinCount", 0);
        setIntField(term4212037, term4212037.getClass(), "charaIllustId", 0);
        setIntField(term4212037, term4212037.getClass(), "skillId", 0);
        setIntField(term4212037, term4212037.getClass(), "overPowerPoint", 0);
        setIntField(term4212037, term4212037.getClass(), "overPowerRate", 0);
        setIntField(term4212037, term4212037.getClass(), "overPowerLowerRank", 0);
        setIntField(term4212037, term4212037.getClass(), "avatarPoint", 0);
        setIntField(term4212037, term4212037.getClass(), "battleRankId", 0);
        setIntField(term4212037, term4212037.getClass(), "battleRankPoint", 0);
        setIntField(term4212037, term4212037.getClass(), "eliteRankPoint", 0);
        setIntField(term4212037, term4212037.getClass(), "netBattle1stCount", 0);
        setIntField(term4212037, term4212037.getClass(), "netBattle2ndCount", 0);
        setIntField(term4212037, term4212037.getClass(), "netBattle3rdCount", 0);
        setIntField(term4212037, term4212037.getClass(), "netBattle4thCount", 0);
        setIntField(term4212037, term4212037.getClass(), "netBattleCorrection", 0);
        setIntField(term4212037, term4212037.getClass(), "netBattleErrCnt", 0);
        setIntField(term4212037, term4212037.getClass(), "netBattleHostErrCnt", 0);
        setIntField(term4212037, term4212037.getClass(), "battleRewardStatus", 0);
        setIntField(term4212037, term4212037.getClass(), "battleRewardIndex", 0);
        setIntField(term4212037, term4212037.getClass(), "battleRewardCount", 0);
        setIntField(term4212037, term4212037.getClass(), "ext1", 0);
        setIntField(term4212037, term4212037.getClass(), "ext2", 0);
        setIntField(term4212037, term4212037.getClass(), "ext3", 0);
        setIntField(term4212037, term4212037.getClass(), "ext4", 0);
        setIntField(term4212037, term4212037.getClass(), "ext5", 0);
        setIntField(term4212037, term4212037.getClass(), "ext6", 0);
        setIntField(term4212037, term4212037.getClass(), "ext7", 0);
        setIntField(term4212037, term4212037.getClass(), "ext8", 0);
        setIntField(term4212037, term4212037.getClass(), "ext9", 0);
        setIntField(term4212037, term4212037.getClass(), "ext10", 0);
        setField(term4212037, term4212037.getClass(), "extStr1", null);
        setField(term4212037, term4212037.getClass(), "extStr2", null);
        setLongField(term4212037, term4212037.getClass(), "extLong1", 0L);
        setLongField(term4212037, term4212037.getClass(), "extLong2", 0L);
        setField(term4212037, term4212037.getClass(), "rankUpChallengeResults", null);
        setBooleanField(term4212037, term4212037.getClass(), "isNetBattleHost", false);
        setIntField(term4212037, term4212037.getClass(), "netBattleEndState", 0);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.chusan.model.userdata.UserData");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getId", argTypes, term4212037, args);
    }

};


