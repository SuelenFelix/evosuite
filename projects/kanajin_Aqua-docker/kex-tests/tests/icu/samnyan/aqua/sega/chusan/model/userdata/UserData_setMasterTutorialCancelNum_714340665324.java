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
import java.lang.Integer;

public class UserData_setMasterTutorialCancelNum_714340665324 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term286552;
     Object term286629;

    public UserData_setMasterTutorialCancelNum_714340665324() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term286552 = newInstance(Class.forName("icu.samnyan.aqua.sega.chusan.model.userdata.UserData"));
        setLongField(term286552, term286552.getClass(), "id", 0L);
        setField(term286552, term286552.getClass(), "card", null);
        setField(term286552, term286552.getClass(), "userName", null);
        setIntField(term286552, term286552.getClass(), "level", 0);
        setIntField(term286552, term286552.getClass(), "reincarnationNum", 0);
        setField(term286552, term286552.getClass(), "exp", null);
        setLongField(term286552, term286552.getClass(), "point", 0L);
        setLongField(term286552, term286552.getClass(), "totalPoint", 0L);
        setIntField(term286552, term286552.getClass(), "playCount", 0);
        setIntField(term286552, term286552.getClass(), "multiPlayCount", 0);
        setIntField(term286552, term286552.getClass(), "playerRating", 0);
        setIntField(term286552, term286552.getClass(), "highestRating", 0);
        setIntField(term286552, term286552.getClass(), "nameplateId", 0);
        setIntField(term286552, term286552.getClass(), "frameId", 0);
        setIntField(term286552, term286552.getClass(), "characterId", 0);
        setIntField(term286552, term286552.getClass(), "trophyId", 0);
        setIntField(term286552, term286552.getClass(), "playedTutorialBit", 0);
        setIntField(term286552, term286552.getClass(), "firstTutorialCancelNum", 0);
        setIntField(term286552, term286552.getClass(), "masterTutorialCancelNum", 0);
        setIntField(term286552, term286552.getClass(), "totalMapNum", 0);
        setLongField(term286552, term286552.getClass(), "totalHiScore", 0L);
        setLongField(term286552, term286552.getClass(), "totalBasicHighScore", 0L);
        setLongField(term286552, term286552.getClass(), "totalAdvancedHighScore", 0L);
        setLongField(term286552, term286552.getClass(), "totalExpertHighScore", 0L);
        setLongField(term286552, term286552.getClass(), "totalMasterHighScore", 0L);
        setLongField(term286552, term286552.getClass(), "totalUltimaHighScore", 0L);
        setField(term286552, term286552.getClass(), "eventWatchedDate", null);
        setIntField(term286552, term286552.getClass(), "friendCount", 0);
        setField(term286552, term286552.getClass(), "firstGameId", null);
        setField(term286552, term286552.getClass(), "firstRomVersion", null);
        setField(term286552, term286552.getClass(), "firstDataVersion", null);
        setField(term286552, term286552.getClass(), "firstPlayDate", null);
        setField(term286552, term286552.getClass(), "lastGameId", null);
        setField(term286552, term286552.getClass(), "lastRomVersion", null);
        setField(term286552, term286552.getClass(), "lastDataVersion", null);
        setField(term286552, term286552.getClass(), "lastLoginDate", null);
        setField(term286552, term286552.getClass(), "lastPlayDate", null);
        setIntField(term286552, term286552.getClass(), "lastPlaceId", 0);
        setField(term286552, term286552.getClass(), "lastPlaceName", null);
        setField(term286552, term286552.getClass(), "lastRegionId", null);
        setField(term286552, term286552.getClass(), "lastRegionName", null);
        setField(term286552, term286552.getClass(), "lastAllNetId", null);
        setField(term286552, term286552.getClass(), "lastClientId", null);
        setField(term286552, term286552.getClass(), "lastCountryCode", null);
        setField(term286552, term286552.getClass(), "userNameEx", null);
        setField(term286552, term286552.getClass(), "compatibleCmVersion", null);
        setIntField(term286552, term286552.getClass(), "medal", 0);
        setIntField(term286552, term286552.getClass(), "mapIconId", 0);
        setIntField(term286552, term286552.getClass(), "voiceId", 0);
        setIntField(term286552, term286552.getClass(), "avatarWear", 0);
        setIntField(term286552, term286552.getClass(), "avatarHead", 0);
        setIntField(term286552, term286552.getClass(), "avatarFace", 0);
        setIntField(term286552, term286552.getClass(), "avatarSkin", 0);
        setIntField(term286552, term286552.getClass(), "avatarItem", 0);
        setIntField(term286552, term286552.getClass(), "avatarFront", 0);
        setIntField(term286552, term286552.getClass(), "avatarBack", 0);
        setIntField(term286552, term286552.getClass(), "classEmblemBase", 0);
        setIntField(term286552, term286552.getClass(), "classEmblemMedal", 0);
        setIntField(term286552, term286552.getClass(), "stockedGridCount", 0);
        setIntField(term286552, term286552.getClass(), "exMapLoopCount", 0);
        setIntField(term286552, term286552.getClass(), "netBattlePlayCount", 0);
        setIntField(term286552, term286552.getClass(), "netBattleWinCount", 0);
        setIntField(term286552, term286552.getClass(), "netBattleLoseCount", 0);
        setIntField(term286552, term286552.getClass(), "netBattleConsecutiveWinCount", 0);
        setIntField(term286552, term286552.getClass(), "charaIllustId", 0);
        setIntField(term286552, term286552.getClass(), "skillId", 0);
        setIntField(term286552, term286552.getClass(), "overPowerPoint", 0);
        setIntField(term286552, term286552.getClass(), "overPowerRate", 0);
        setIntField(term286552, term286552.getClass(), "overPowerLowerRank", 0);
        setIntField(term286552, term286552.getClass(), "avatarPoint", 0);
        setIntField(term286552, term286552.getClass(), "battleRankId", 0);
        setIntField(term286552, term286552.getClass(), "battleRankPoint", 0);
        setIntField(term286552, term286552.getClass(), "eliteRankPoint", 0);
        setIntField(term286552, term286552.getClass(), "netBattle1stCount", 0);
        setIntField(term286552, term286552.getClass(), "netBattle2ndCount", 0);
        setIntField(term286552, term286552.getClass(), "netBattle3rdCount", 0);
        setIntField(term286552, term286552.getClass(), "netBattle4thCount", 0);
        setIntField(term286552, term286552.getClass(), "netBattleCorrection", 0);
        setIntField(term286552, term286552.getClass(), "netBattleErrCnt", 0);
        setIntField(term286552, term286552.getClass(), "netBattleHostErrCnt", 0);
        setIntField(term286552, term286552.getClass(), "battleRewardStatus", 0);
        setIntField(term286552, term286552.getClass(), "battleRewardIndex", 0);
        setIntField(term286552, term286552.getClass(), "battleRewardCount", 0);
        setIntField(term286552, term286552.getClass(), "ext1", 0);
        setIntField(term286552, term286552.getClass(), "ext2", 0);
        setIntField(term286552, term286552.getClass(), "ext3", 0);
        setIntField(term286552, term286552.getClass(), "ext4", 0);
        setIntField(term286552, term286552.getClass(), "ext5", 0);
        setIntField(term286552, term286552.getClass(), "ext6", 0);
        setIntField(term286552, term286552.getClass(), "ext7", 0);
        setIntField(term286552, term286552.getClass(), "ext8", 0);
        setIntField(term286552, term286552.getClass(), "ext9", 0);
        setIntField(term286552, term286552.getClass(), "ext10", 0);
        setField(term286552, term286552.getClass(), "extStr1", null);
        setField(term286552, term286552.getClass(), "extStr2", null);
        setLongField(term286552, term286552.getClass(), "extLong1", 0L);
        setLongField(term286552, term286552.getClass(), "extLong2", 0L);
        setField(term286552, term286552.getClass(), "rankUpChallengeResults", null);
        setBooleanField(term286552, term286552.getClass(), "isNetBattleHost", false);
        setIntField(term286552, term286552.getClass(), "netBattleEndState", 0);
        term286629 = new Integer(0);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.chusan.model.userdata.UserData");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = int.class;
        Object[] args = new Object[1];
        args[0] = term286629;
        callMethod(klass, "setMasterTutorialCancelNum", argTypes, term286552, args);
    }

};


